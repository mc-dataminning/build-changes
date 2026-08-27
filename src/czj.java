import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czj extends cyr {
   public static final MapCodec<czj> a = b(czj::new);
   public static final dmv[] b = new dmv[]{dmu.k, dmu.l, dmu.m};
   protected static final epo c = epl.a(czf.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), czf.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<czj> a() {
      return a;
   }

   public czj(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? null : a($$2, djn.l, djo::a);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof djo) {
            $$3.a((djo)$$5);
            $$3.a(atz.aa);
         }

         return bml.b;
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof djo) {
            ((djo)$$5).a($$4.z());
         }
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(kb.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.a($$1.c_($$2));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
