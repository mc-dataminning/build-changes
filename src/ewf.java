import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ewf extends ewm {
   public final ayc<dno> a;
   public static final MapCodec<ewf> b = ayc.b(mi.i).xmap(ewf::new, $$0 -> $$0.a).fieldOf("value");

   public ewf(ayc<dno> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      return ekw.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ewo<?> a() {
      return ewo.n;
   }
}
