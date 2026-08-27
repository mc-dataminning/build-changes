import javax.annotation.Nullable;

public class cst extends csd {
   public static final dfv[] a = new dfv[]{dfu.k, dfu.l, dfu.m};
   protected static final eib b = ehy.a(csq.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), csq.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public cst(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dct($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? null : a($$2, dcs.l, dct::a);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         dcq $$6 = $$1.c_($$2);
         if ($$6 instanceof dct) {
            $$3.a((dct)$$6);
            $$3.a(apj.aa);
         }

         return bgt.b;
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof dct) {
            ((dct)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof dct) {
            bgp.a($$1, $$2, (dct)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ceg.a($$1.c_($$2));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
