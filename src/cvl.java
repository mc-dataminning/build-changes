import com.mojang.serialization.MapCodec;

public class cvl extends cva {
   public static final MapCodec<cvl> a = b(cvl::new);
   public static final dii b = dhy.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ekn e = cva.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ekn f = cva.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cvl> a() {
      return a;
   }

   protected cvl(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      ht $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dhi $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return e;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return f;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      for (hx $$3 : hx.c.a) {
         dhi $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(arl.b)) {
            return false;
         }
      }

      dhi $$5 = $$1.a_($$2.d());
      return ($$5.a(cvc.dQ) || $$5.a(arg.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      $$3.a($$1.ah().j(), 1.0F);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
