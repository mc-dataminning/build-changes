import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ewn(ald<eww> b) implements eww {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a(lw.bg).fieldOf("name").forGetter(ewn::c)).apply($$0, ewn::new));

   @Override
   public ewx b() {
      return ewy.p;
   }

   @Override
   public void a(etr $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         eww.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(etl $$0) {
      eww $$1 = $$0.a().c(this.b).map(jo.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         etl.c<?> $$2 = etl.a($$1);
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

   public static eww.a a(ald<eww> $$0) {
      return () -> new ewn($$0);
   }

   public ald<eww> c() {
      return this.b;
   }
}
