import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fbn(ald<fbw> b) implements fbw {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fbn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a(mg.bq).fieldOf("name").forGetter(fbn::c)).apply($$0, fbn::new));

   @Override
   public fbx b() {
      return fby.p;
   }

   @Override
   public void a(eyt $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fbw.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eyn $$0) {
      fbw $$1 = $$0.a().c(this.b).map(je.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eyn.c<?> $$2 = eyn.a($$1);
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

   public static fbw.a a(ald<fbw> $$0) {
      return () -> new fbn($$0);
   }

   public ald<fbw> c() {
      return this.b;
   }
}
