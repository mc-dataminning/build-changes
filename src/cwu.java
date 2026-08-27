import com.mojang.serialization.MapCodec;

public abstract class cwu extends cyo {
   protected static final ekb c = cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dhn d = dhm.w;

   protected cwu(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwu> a();

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$2.a($$0, $$1, hx.b, dct.c);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!this.c((crv)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((crs)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eky.b);
            }
         }
      }
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if ($$0.a((crv)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         der $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (hx $$7 : hx.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(crs $$0, ht $$1, dgw $$2) {
      if (!this.c((crv)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.L().b($$1, this)) {
            eky $$5 = eky.c;
            if (this.b((cqy)$$0, $$1, $$2)) {
               $$5 = eky.a;
            } else if ($$3) {
               $$5 = eky.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(crv $$0, ht $$1, dgw $$2) {
      return false;
   }

   protected boolean a(crs $$0, ht $$1, dgw $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(crs $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(aE);
      ht $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dgw $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cuv.cw) ? $$6.c(dau.f) : 0);
      }
   }

   protected int a(csi $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(aE);
      hx $$4 = $$3.h();
      hx $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(crs $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(aE);
      ht $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cqy $$0, ht $$1, dgw $$2) {
      return 15;
   }

   public static boolean h(dgw $$0) {
      return $$0.b() instanceof cwu;
   }

   public boolean b(cqy $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(aE).g();
      dgw $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dgw var1);
}
