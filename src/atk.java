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

public class atk extends asy {
   private static final Logger c = LogUtils.getLogger();
   private static final Joiner d = Joiner.on("/");
   private final Path e;

   public atk(atg $$0, Path $$1) {
      super($$0);
      this.e = $$1;
   }

   @Nullable
   @Override
   public aun<InputStream> a(String... $$0) {
      v.a($$0);
      Path $$1 = v.a(this.e, List.of($$0));
      return Files.exists($$1) ? aun.create($$1) : null;
   }

   public static boolean a(Path $$0) {
      return true;
   }

   @Nullable
   @Override
   public aun<InputStream> a(atj $$0, ale $$1) {
      Path $$2 = this.e.resolve($$0.a()).resolve($$1.b());
      return a($$1, $$2);
   }

   @Nullable
   public static aun<InputStream> a(ale $$0, Path $$1) {
      return (aun<InputStream>)v.d($$0.a()).mapOrElse($$1x -> {
         Path $$2 = v.a($$1, $$1x);
         return b($$2);
      }, $$1x -> {
         c.error("Invalid path {}: {}", $$0, $$1x.message());
         return null;
      });
   }

   @Nullable
   private static aun<InputStream> b(Path $$0) {
      return Files.exists($$0) && a($$0) ? aun.create($$0) : null;
   }

   @Override
   public void a(atj $$0, String $$1, String $$2, ath.a $$3) {
      v.d($$2).ifSuccess($$3x -> {
         Path $$4 = this.e.resolve($$0.a()).resolve($$1);
         a($$1, $$4, $$3x, $$3);
      }).ifError($$1x -> c.error("Invalid path {}: {}", $$2, $$1x.message()));
   }

   public static void a(String $$0, Path $$1, List<String> $$2, ath.a $$3) {
      Path $$4 = v.a($$1, $$2);

      try (Stream<Path> $$5 = Files.find($$4, Integer.MAX_VALUE, ($$0x, $$1x) -> $$1x.isRegularFile())) {
         $$5.forEach($$3x -> {
            String $$4x = d.join($$1.relativize($$3x));
            ale $$5x = ale.b($$0, $$4x);
            if ($$5x == null) {
               ad.b(String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", $$0, $$4x));
            } else {
               $$3.accept($$5x, aun.create($$3x));
            }
         });
      } catch (NotDirectoryException | NoSuchFileException var10) {
      } catch (IOException var11) {
         c.error("Failed to list path {}", $$4, var11);
      }
   }

   @Override
   public Set<String> a(atj $$0) {
      Set<String> $$1 = Sets.newHashSet();
      Path $$2 = this.e.resolve($$0.a());

      try (DirectoryStream<Path> $$3 = Files.newDirectoryStream($$2)) {
         for (Path $$4 : $$3) {
            String $$5 = $$4.getFileName().toString();
            if (ale.j($$5)) {
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

   public static class a implements aud.c {
      private final Path a;

      public a(Path $$0) {
         this.a = $$0;
      }

      @Override
      public ath a(atg $$0) {
         return new atk($$0, this.a);
      }

      @Override
      public ath a(atg $$0, aud.a $$1) {
         ath $$2 = this.a($$0);
         List<String> $$3 = $$1.d();
         if ($$3.isEmpty()) {
            return $$2;
         } else {
            List<ath> $$4 = new ArrayList<>($$3.size());

            for (String $$5 : $$3) {
               Path $$6 = this.a.resolve($$5);
               $$4.add(new atk($$0, $$6));
            }

            return new ata($$2, $$4);
         }
      }
   }
}
