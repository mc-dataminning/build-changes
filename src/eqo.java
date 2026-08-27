import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eqo extends eqs {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eqo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akm.a(lf.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eqo::new)
   );
   private final akm<eqt> c;

   private eqo(List<esn> $$0, akm<eqt> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public equ b() {
      return eqv.E;
   }

   @Override
   public void a(epn $$0) {
      if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lf.aV, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      eqt $$2 = $$1.a().a(lf.aV, this.c).map(ix::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eph.c<?> $$3 = eph.a($$2);
         if ($$1.b($$3)) {
            ctq var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static eqs.a<?> a(akm<eqt> $$0) {
      return a($$1 -> new eqo($$1, $$0));
   }
}
