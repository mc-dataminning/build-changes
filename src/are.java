import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class are implements ara {
   private static final Logger c = LogUtils.getLogger();
   private final aqz d;
   private final aqs e;
   private final Set<String> f;
   private final List<Path> g;
   private final Map<arc, List<Path>> h;

   are(aqz $$0, aqs $$1, Set<String> $$2, List<Path> $$3, Map<arc, List<Path>> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   @Nullable
   @Override
   public asg<InputStream> a(String... $$0) {
      v.a($$0);
      List<String> $$1 = List.of($$0);

      for (Path $$2 : this.g) {
         Path $$3 = v.a($$2, $$1);
         if (Files.exists($$3) && ard.a($$3)) {
            return asg.create($$3);
         }
      }

      return null;
   }

   public void a(arc $$0, ajh $$1, Consumer<Path> $$2) {
      v.c($$1.a()).get().ifLeft($$3 -> {
         String $$4 = $$1.b();

         for (Path $$5 : this.h.get($$0)) {
            Path $$6 = $$5.resolve($$4);
            $$2.accept(v.a($$6, $$3));
         }
      }).ifRight($$1x -> c.error("Invalid path {}: {}", $$1, $$1x.message()));
   }

   @Override
   public void a(arc $$0, String $$1, String $$2, ara.a $$3) {
      v.c($$2).get().ifLeft($$3x -> {
         List<Path> $$4 = this.h.get($$0);
         int $$5 = $$4.size();
         if ($$5 == 1) {
            a($$3, $$1, $$4.get(0), $$3x);
         } else if ($$5 > 1) {
            Map<ajh, asg<InputStream>> $$6 = new HashMap<>();

            for (int $$7 = 0; $$7 < $$5 - 1; $$7++) {
               a($$6::putIfAbsent, $$1, $$4.get($$7), $$3x);
            }

            Path $$8 = $$4.get($$5 - 1);
            if ($$6.isEmpty()) {
               a($$3, $$1, $$8, $$3x);
            } else {
               a($$6::putIfAbsent, $$1, $$8, $$3x);
               $$6.forEach($$3);
            }
         }
      }).ifRight($$1x -> c.error("Invalid path {}: {}", $$2, $$1x.message()));
   }

   private static void a(ara.a $$0, String $$1, Path $$2, List<String> $$3) {
      Path $$4 = $$2.resolve($$1);
      ard.a($$1, $$4, $$3, $$0);
   }

   @Nullable
   @Override
   public asg<InputStream> a(arc $$0, ajh $$1) {
      return (asg<InputStream>)v.c($$1.a()).get().map($$2 -> {
         String $$3 = $$1.b();

         for (Path $$4 : this.h.get($$0)) {
            Path $$5 = v.a($$4.resolve($$3), $$2);
            if (Files.exists($$5) && ard.a($$5)) {
               return asg.create($$5);
            }
         }

         return null;
      }, $$1x -> {
         c.error("Invalid path {}: {}", $$1, $$1x.message());
         return null;
      });
   }

   @Override
   public Set<String> a(arc $$0) {
      return this.f;
   }

   @Nullable
   @Override
   public <T> T a(arn<T> $$0) {
      asg<InputStream> $$1 = this.a("pack.mcmeta");
      if ($$1 != null) {
         try (InputStream $$2 = $$1.get()) {
            T $$3 = aqr.a($$0, $$2);
            if ($$3 != null) {
               return $$3;
            }

            return this.e.a($$0);
         } catch (IOException var8) {
         }
      }

      return this.e.a($$0);
   }

   @Override
   public aqz a() {
      return this.d;
   }

   @Override
   public void close() {
   }

   public asr d() {
      return $$0 -> Optional.ofNullable(this.a(arc.a, $$0)).map($$0x -> new asm(this, $$0x));
   }
}
