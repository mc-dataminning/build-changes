import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eun(akp<euw> b) implements euw {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akp.a(lu.be).fieldOf("name").forGetter(eun::c)).apply($$0, eun::new));

   @Override
   public eux b() {
      return euy.p;
   }

   @Override
   public void a(err $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         euw.super.a($$0);
         $$0.a()
            .a(lu.be, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(erl $$0) {
      euw $$1 = $$0.a().a(lu.be, this.b).map(jm.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         erl.c<?> $$2 = erl.a($$1);
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

   public static euw.a a(akp<euw> $$0) {
      return () -> new eun($$0);
   }

   public akp<euw> c() {
      return this.b;
   }
}
