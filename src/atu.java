import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atu extends ati {
   private static final Logger c = LogUtils.getLogger();
   private static final Joiner d = Joiner.on("/");
   private final Path e;

   public atu(atq $$0, Path $$1) {
      super($$0);
      this.e = $$1;
   }

   @Nullable
   @Override
   public auw<InputStream> a(String... $$0) {
      w.a($$0);
      Path $$1 = w.a(this.e, List.of($$0));
      return Files.exists($$1) ? auw.create($$1) : null;
   }

   public static boolean a(Path $$0) {
      return true;
   }

   @Nullable
   @Override
   public auw<InputStream> a(att $$0, ali $$1) {
      Path $$2 = this.e.resolve($$0.a()).resolve($$1.b());
      return a($$1, $$2);
   }

   @Nullable
   public static auw<InputStream> a(ali $$0, Path $$1) {
      return (auw<InputStream>)w.d($$0.a()).mapOrElse($$1x -> {
         Path $$2 = w.a($$1, $$1x);
         return b($$2);
      }, $$1x -> {
         c.error("Invalid path {}: {}", $$0, $$1x.message());
         return null;
      });
   }

   @Nullable
   private static auw<InputStream> b(Path $$0) {
      return Files.exists($$0) && a($$0) ? auw.create($$0) : null;
   }

   @Override
   public void a(att $$0, String $$1, String $$2, atr.a $$3) {
      w.d($$2).ifSuccess($$3x -> {
         Path $$4 = this.e.resolve($$0.a()).resolve($$1);
         a($$1, $$4, $$3x, $$3);
      }).ifError($$1x -> c.error("Invalid path {}: {}", $$2, $$1x.message()));
   }

   public static void a(String $$0, Path $$1, List<String> $$2, atr.a $$3) {
      Path $$4 = w.a($$1, $$2);

      try (Stream<Path> $$5 = Files.find($$4, Integer.MAX_VALUE, ($$0x, $$1x) -> $$1x.isRegularFile())) {
         $$5.forEach($$3x -> {
            String $$4x = d.join($$1.relativize($$3x));
            ali $$5x = ali.b($$0, $$4x);
            if ($$5x == null) {
               ag.b(String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", $$0, $$4x));
            } else {
               $$3.accept($$5x, auw.create($$3x));
            }
         });
      } catch (NotDirectoryException | NoSuchFileException var10) {
      } catch (IOException var11) {
         c.error("Failed to list path {}", $$4, var11);
      }
   }

   @Override
   public Set<String> a(att $$0) {
      Set<String> $$1 = Sets.newHashSet();
      Path $$2 = this.e.resolve($$0.a());

      try (DirectoryStream<Path> $$3 = Files.newDirectoryStream($$2)) {
         for (Path $$4 : $$3) {
            String $$5 = $$4.getFileName().toString();
            if (ali.j($$5)) {
               $$1.add($$5);
            } else {
               c.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", $$5, this.e);
            }
         }
      } catch (NotDirectoryException | NoSuchFileException var10) {
      } catch (IOException var11) {
         c.error("Failed to list path {}", $$2, var11);
      }

      return $$1;
   }

   @Override
   public void close() {
   }

   public static class a implements aum.c {
      private final Path a;

      public a(Path $$0) {
         this.a = $$0;
      }

      @Override
      public atr a(atq $$0) {
         return new atu($$0, this.a);
      }

      @Override
      public atr a(atq $$0, aum.a $$1) {
         atr $$2 = this.a($$0);
         List<String> $$3 = $$1.d();
         if ($$3.isEmpty()) {
            return $$2;
         } else {
            List<atr> $$4 = new ArrayList<>($$3.size());

            for (String $$5 : $$3) {
               Path $$6 = this.a.resolve($$5);
               $$4.add(new atu($$0, $$6));
            }

            return new atk($$2, $$4);
         }
      }
   }
}
