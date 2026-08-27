import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cve extends cum {
   public static final MapCodec<cve> a = b(cve::new);
   public static final dhz[] b = new dhz[]{dhy.k, dhy.l, dhy.m};
   protected static final ekn c = ekk.a(cva.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cva.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cve> a() {
      return a;
   }

   public cve(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? null : a($$2, dff.l, dfg::a);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         dfd $$6 = $$1.c_($$2);
         if ($$6 instanceof dfg) {
            $$3.a((dfg)$$6);
            $$3.a(arb.aa);
         }

         return bix.b;
      }
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfg) {
            ((dfg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
