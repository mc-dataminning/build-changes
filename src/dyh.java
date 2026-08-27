import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyh extends dyo {
   public final aqa<csl> a;
   public static final Codec<dyh> b = aqa.b(jc.e).xmap(dyh::new, $$0 -> $$0.a);

   public dyh(aqa<csl> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      return dnm.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dyq<?> a() {
      return dyq.n;
   }
}
