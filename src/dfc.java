import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfc extends dek {
   public static final MapCodec<dfc> a = b(dfc::new);
   public static final dss[] b = new dss[]{dsr.k, dsr.l, dsr.m};
   protected static final ewj c = ewg.a(dey.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dey.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? null : a($$2, dpi.l, dpj::a);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dpj) {
            $$3.a((dpj)$$5);
            $$3.a(awj.aa);
         }

         return bqt.c;
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
