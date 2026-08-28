import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpm extends dhk {
   public static final MapCodec<dpm> a = b(dpm::new);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   protected dpm(dvc.d $$0) {
      super($$0);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.j, $$0.C ? dtw::a : dtw::b);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfp.a($$0, $$2, "SpawnData");
   }
}
