import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class ari {
   private static final Logger a = LogUtils.getLogger();

   public static void a(Path $$0, int $$1) {
      try {
         List<ari.b> $$2 = a($$0);
         int $$3 = $$2.size() - $$1;
         if ($$3 <= 0) {
            return;
         }

         $$2.sort(ari.b.a);
         List<ari.a> $$4 = a($$2);
         Collections.reverse($$4);
         $$4.sort(ari.a.a);
         Set<Path> $$5 = new HashSet<>();

         for (int $$6 = 0; $$6 < $$3; $$6++) {
            ari.a $$7 = $$4.get($$6);
            Path $$8 = $$7.b;

            try {
               Files.delete($$8);
               if ($$7.c == 0) {
                  $$5.add($$8.getParent());
               }
            } catch (IOException var12) {
               a.warn("Failed to delete cache file {}", $$8, var12);
            }
         }

         $$5.remove($$0);

         for (Path $$10 : $$5) {
            try {
               Files.delete($$10);
            } catch (DirectoryNotEmptyException var10) {
            } catch (IOException var11) {
               a.warn("Failed to delete empty(?) cache directory {}", $$10, var11);
            }
         }
      } catch (UncheckedIOException | IOException var13) {
         a.error("Failed to vacuum cache dir {}", $$0, var13);
      }
   }

   private static List<ari.b> a(final Path $$0) throws IOException {
      try {
         final List<ari.b> $$1 = new ArrayList<>();
         Files.walkFileTree($$0, new SimpleFileVisitor<Path>() {
            public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) {
               if ($$1.isRegularFile() && !$$0.getParent().equals($$0)) {
                  FileTime $$2 = $$1.lastModifiedTime();
                  $$1.add(new ari.b($$0, $$2));
               }

               return FileVisitResult.CONTINUE;
            }
         });
         return $$1;
      } catch (NoSuchFileException var2) {
         return List.of();
      }
   }

   private static List<ari.a> a(List<ari.b> $$0) {
      List<ari.a> $$1 = new ArrayList<>();
      Object2IntOpenHashMap<Path> $$2 = new Object2IntOpenHashMap();

      for (ari.b $$3 : $$0) {
         int $$4 = $$2.addTo($$3.b.getParent(), 1);
         $$1.add(new ari.a($$3.b, $$4));
      }

      return $$1;
   }

   static record a(Path b, int c) {
      public static final Comparator<ari.a> a = Comparator.comparing(ari.a::b).reversed();

      public Path a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   static record b(Path b, FileTime c) {
      public static final Comparator<ari.b> a = Comparator.comparing(ari.b::b).reversed();

      public Path a() {
         return this.b;
      }

      public FileTime b() {
         return this.c;
      }
   }
}
