import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecv extends edc {
   public final asv<cwp> a;
   public static final Codec<ecv> b = asv.b(ke.f).xmap(ecv::new, $$0 -> $$0.a);

   public ecv(asv<cwp> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      return drt.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ede<?> a() {
      return ede.n;
   }
}
