import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fbz(alf<fci> b) implements fci {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fbz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a(mg.br).fieldOf("name").forGetter(fbz::c)).apply($$0, fbz::new));

   @Override
   public fcj b() {
      return fck.p;
   }

   @Override
   public void a(ezf $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fci.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eyz $$0) {
      fci $$1 = $$0.a().c(this.b).map(je.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eyz.c<?> $$2 = eyz.a($$1);
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

   public static fci.a a(alf<fci> $$0) {
      return () -> new fbz($$0);
   }

   public alf<fci> c() {
      return this.b;
   }
}
