import com.mojang.serialization.MapCodec;

public abstract class dga extends dhu {
   protected static final evd c = ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final drs d = drr.w;

   protected dga(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dga> a();

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dba $$0, io $$1, drb $$2) {
      return $$2.a($$0, $$1, it.b, dlz.c);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!this.c((dba)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dax)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), ewf.b);
            }
         }
      }
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if ($$0.a((dba)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dog $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (it $$7 : it.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dax $$0, io $$1, drb $$2) {
      if (!this.c((dba)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.O().b($$1, this)) {
            ewf $$5 = ewf.c;
            if (this.b((dad)$$0, $$1, $$2)) {
               $$5 = ewf.a;
            } else if ($$3) {
               $$5 = ewf.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dba $$0, io $$1, drb $$2) {
      return false;
   }

   protected boolean a(dax $$0, io $$1, drb $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dax $$0, io $$1, drb $$2) {
      it $$3 = $$2.c(aE);
      io $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         drb $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dea.cw) ? $$6.c(dka.f) : 0);
      }
   }

   protected int a(dbn $$0, io $$1, drb $$2) {
      it $$3 = $$2.c(aE);
      it $$4 = $$3.h();
      it $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dax $$0, io $$1, drb $$2) {
      it $$3 = $$2.c(aE);
      io $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dad $$0, io $$1, drb $$2) {
      return 15;
   }

   public static boolean m(drb $$0) {
      return $$0.b() instanceof dga;
   }

   public boolean b(dad $$0, io $$1, drb $$2) {
      it $$3 = $$2.c(aE).g();
      drb $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(drb var1);
}
