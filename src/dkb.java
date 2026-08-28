import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends djk implements dkn {
   public static final MapCodec<dkb> c = b(dkb::new);

   @Override
   public MapCodec<dkb> a() {
      return c;
   }

   protected dkb(dsz.d $$0) {
      super($$0, ji.b, exm.b(), true);
   }

   @Override
   protected djl c() {
      return (djl)dfy.mc;
   }

   @Override
   protected eoy b_(dta $$0) {
      return eoz.c.a(false);
   }

   @Override
   protected boolean m(dta $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmv $$0, dca $$1, jd $$2, dta $$3, eox $$4) {
      return false;
   }

   @Override
   public boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      return false;
   }
}
