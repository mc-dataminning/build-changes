import com.mojang.serialization.MapCodec;

public abstract class dej extends dgc {
   protected static final etc c = dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dpz d = dpy.w;

   protected dej(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dej> a();

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(czj $$0, id $$1, dpi $$2) {
      return $$2.a($$0, $$1, ij.b, dkh.c);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!this.c((czj)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((czg)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eue.b);
            }
         }
      }
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$0.a((czj)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dmo $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ij $$7 : ij.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(czg $$0, id $$1, dpi $$2) {
      if (!this.c((czj)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.O().b($$1, this)) {
            eue $$5 = eue.c;
            if (this.b((cym)$$0, $$1, $$2)) {
               $$5 = eue.a;
            } else if ($$3) {
               $$5 = eue.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(czj $$0, id $$1, dpi $$2) {
      return false;
   }

   protected boolean a(czg $$0, id $$1, dpi $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(czg $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(aE);
      id $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dpi $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dcj.cw) ? $$6.c(dii.f) : 0);
      }
   }

   protected int a(czw $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(aE);
      ij $$4 = $$3.h();
      ij $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(czg $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(aE);
      id $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cym $$0, id $$1, dpi $$2) {
      return 15;
   }

   public static boolean m(dpi $$0) {
      return $$0.b() instanceof dej;
   }

   public boolean b(cym $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(aE).g();
      dpi $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dpi var1);
}
