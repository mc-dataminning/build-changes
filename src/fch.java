import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fch(alf<fcq> b) implements fcq {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fch> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a(mg.bs).fieldOf("name").forGetter(fch::c)).apply($$0, fch::new));

   @Override
   public fcr b() {
      return fcs.p;
   }

   @Override
   public void a(ezn $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fcq.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(ezh $$0) {
      fcq $$1 = $$0.a().c(this.b).map(je.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         ezh.c<?> $$2 = ezh.a($$1);
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

   public static fcq.a a(alf<fcq> $$0) {
      return () -> new fch($$0);
   }

   public alf<fcq> c() {
      return this.b;
   }
}
