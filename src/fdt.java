import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fdt(alq<fec> b) implements fec {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fdt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alq.a(mi.bt).fieldOf("name").forGetter(fdt::c)).apply($$0, fdt::new));

   @Override
   public fed b() {
      return fee.p;
   }

   @Override
   public void a(faz $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fec.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(fat $$0) {
      fec $$1 = $$0.a().c(this.b).map(jg.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         fat.c<?> $$2 = fat.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static fec.a a(alq<fec> $$0) {
      return () -> new fdt($$0);
   }

   public alq<fec> c() {
      return this.b;
   }
}
