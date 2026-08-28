import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ayk implements Closeable {
   private static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final Path c;
   private final FileSystem d;

   public ayk(Path $$0) {
      this.b = $$0;
      this.c = $$0.resolveSibling($$0.getFileName().toString() + "_tmp");

      try {
         this.d = ac.f.newFileSystem(this.c, ImmutableMap.of("create", "true"));
      } catch (IOException var3) {
         throw new UncheckedIOException(var3);
      }
   }

   public void a(Path $$0, String $$1) {
      try {
         Path $$2 = this.d.getPath(File.separator);
         Path $$3 = $$2.resolve($$0.toString());
         Files.createDirectories($$3.getParent());
         Files.write($$3, $$1.getBytes(StandardCharsets.UTF_8));
      } catch (IOException var5) {
         throw new UncheckedIOException(var5);
      }
   }

   public void a(Path $$0, File $$1) {
      try {
         Path $$2 = this.d.getPath(File.separator);
         Path $$3 = $$2.resolve($$0.toString());
         Files.createDirectories($$3.getParent());
         Files.copy($$1.toPath(), $$3);
      } catch (IOException var5) {
         throw new UncheckedIOException(var5);
      }
   }

   public void a(Path $$0) {
      try {
         Path $$1 = this.d.getPath(File.separator);
         if (Files.isRegularFile($$0)) {
            Path $$2 = $$1.resolve($$0.getParent().relativize($$0).toString());
            Files.copy($$2, $$0);
         } else {
            try (Stream<Path> $$3 = Files.find($$0, Integer.MAX_VALUE, ($$0x, $$1x) -> $$1x.isRegularFile())) {
               for (Path $$4 : $$3.collect(Collectors.toList())) {
                  Path $$5 = $$1.resolve($$0.relativize($$4).toString());
                  Files.createDirectories($$5.getParent());
                  Files.copy($$4, $$5);
               }
            }
         }
      } catch (IOException var9) {
         throw new UncheckedIOException(var9);
      }
   }

   @Override
   public void close() {
      try {
         this.d.close();
         Files.move(this.c, this.b);
         a.info("Compressed to {}", this.b);
      } catch (IOException var2) {
         throw new UncheckedIOException(var2);
      }
   }
}
