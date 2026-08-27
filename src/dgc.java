import com.mojang.serialization.MapCodec;

public abstract class dgc extends dhw {
   protected static final evf c = dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dru d = drt.w;

   protected dgc(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgc> a();

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dbc $$0, io $$1, drd $$2) {
      return $$2.a($$0, $$1, it.b, dmb.c);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!this.c((dbc)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((daz)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), ewh.b);
            }
         }
      }
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$0.a((dbc)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         doi $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (it $$7 : it.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(daz $$0, io $$1, drd $$2) {
      if (!this.c((dbc)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.O().b($$1, this)) {
            ewh $$5 = ewh.c;
            if (this.b((daf)$$0, $$1, $$2)) {
               $$5 = ewh.a;
            } else if ($$3) {
               $$5 = ewh.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dbc $$0, io $$1, drd $$2) {
      return false;
   }

   protected boolean a(daz $$0, io $$1, drd $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(daz $$0, io $$1, drd $$2) {
      it $$3 = $$2.c(aE);
      io $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         drd $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dec.cw) ? $$6.c(dkc.f) : 0);
      }
   }

   protected int a(dbp $$0, io $$1, drd $$2) {
      it $$3 = $$2.c(aE);
      it $$4 = $$3.h();
      it $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(daz $$0, io $$1, drd $$2) {
      it $$3 = $$2.c(aE);
      io $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(daf $$0, io $$1, drd $$2) {
      return 15;
   }

   public static boolean m(drd $$0) {
      return $$0.b() instanceof dgc;
   }

   public boolean b(daf $$0, io $$1, drd $$2) {
      it $$3 = $$2.c(aE).g();
      drd $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(drd var1);
}
