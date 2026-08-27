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

public class amm implements amj {
   private static final Logger c = LogUtils.getLogger();
   private final ame d;
   private final Set<String> e;
   private final List<Path> f;
   private final Map<amk, List<Path>> g;

   amm(ame $$0, Set<String> $$1, List<Path> $$2, Map<amk, List<Path>> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Nullable
   @Override
   public ann<InputStream> a(String... $$0) {
      v.a($$0);
      List<String> $$1 = List.of($$0);

      for (Path $$2 : this.f) {
         Path $$3 = v.a($$2, $$1);
         if (Files.exists($$3) && aml.a($$3)) {
            return ann.create($$3);
         }
      }

      return null;
   }

   public void a(amk $$0, aey $$1, Consumer<Path> $$2) {
      v.c($$1.a()).get().ifLeft($$3 -> {
         String $$4 = $$1.b();

         for (Path $$5 : this.g.get($$0)) {
            Path $$6 = $$5.resolve($$4);
            $$2.accept(v.a($$6, $$3));
         }
      }).ifRight($$1x -> c.error("Invalid path {}: {}", $$1, $$1x.message()));
   }

   @Override
   public void a(amk $$0, String $$1, String $$2, amj.a $$3) {
      v.c($$2).get().ifLeft($$3x -> {
         List<Path> $$4 = this.g.get($$0);
         int $$5 = $$4.size();
         if ($$5 == 1) {
            a($$3, $$1, $$4.get(0), $$3x);
         } else if ($$5 > 1) {
            Map<aey, ann<InputStream>> $$6 = new HashMap<>();

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

   private static void a(amj.a $$0, String $$1, Path $$2, List<String> $$3) {
      Path $$4 = $$2.resolve($$1);
      aml.a($$1, $$4, $$3, $$0);
   }

   @Nullable
   @Override
   public ann<InputStream> a(amk $$0, aey $$1) {
      return (ann<InputStream>)v.c($$1.a()).get().map($$2 -> {
         String $$3 = $$1.b();

         for (Path $$4 : this.g.get($$0)) {
            Path $$5 = v.a($$4.resolve($$3), $$2);
            if (Files.exists($$5) && aml.a($$5)) {
               return ann.create($$5);
            }
         }

         return null;
      }, $$1x -> {
         c.error("Invalid path {}: {}", $$1, $$1x.message());
         return null;
      });
   }

   @Override
   public Set<String> a(amk $$0) {
      return this.e;
   }

   @Nullable
   @Override
   public <T> T a(amv<T> $$0) {
      ann<InputStream> $$1 = this.a("pack.mcmeta");
      if ($$1 != null) {
         try (InputStream $$2 = $$1.get()) {
            T $$3 = amd.a($$0, $$2);
            if ($$3 != null) {
               return $$3;
            }

            return this.d.a($$0);
         } catch (IOException var8) {
         }
      }

      return this.d.a($$0);
   }

   @Override
   public String a() {
      return "vanilla";
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public void close() {
   }

   public any c() {
      return $$0 -> Optional.ofNullable(this.a(amk.a, $$0)).map($$0x -> new ant(this, $$0x));
   }
}
