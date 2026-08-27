import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebc extends ebj {
   public final arz<cvf> a;
   public static final Codec<ebc> b = arz.b(kd.e).xmap(ebc::new, $$0 -> $$0.a);

   public ebc(arz<cvf> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      return dqa.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ebl<?> a() {
      return ebl.n;
   }
}
