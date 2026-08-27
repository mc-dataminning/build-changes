import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecp extends ecw {
   public final asq<cwj> a;
   public static final Codec<ecp> b = asq.b(ke.f).xmap(ecp::new, $$0 -> $$0.a);

   public ecp(asq<cwj> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      return drn.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ecy<?> a() {
      return ecy.n;
   }
}
