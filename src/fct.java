import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fct(alf<fdc> b) implements fdc {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fct> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a(mh.bt).fieldOf("name").forGetter(fct::c)).apply($$0, fct::new));

   @Override
   public fdd b() {
      return fde.p;
   }

   @Override
   public void a(ezz $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fdc.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(ezt $$0) {
      fdc $$1 = $$0.a().c(this.b).map(jf.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         ezt.c<?> $$2 = ezt.a($$1);
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

   public static fdc.a a(alf<fdc> $$0) {
      return () -> new fct($$0);
   }

   public alf<fdc> c() {
      return this.b;
   }
}
