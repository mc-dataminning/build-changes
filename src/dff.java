import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dff extends den {
   public static final MapCodec<dff> a = b(dff::new);
   public static final dsv[] b = new dsv[]{dsu.k, dsu.l, dsu.m};
   protected static final ewm c = ewj.a(dfb.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dfb.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? null : a($$2, dpl.l, dpm::a);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dpm) {
            $$3.a((dpm)$$5);
            $$3.a(awk.aa);
         }

         return bqw.c;
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
