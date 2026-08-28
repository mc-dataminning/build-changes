import com.mojang.serialization.MapCodec;

public abstract class dgw extends diq {
   protected static final ewf c = deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dso d = dsn.w;

   protected dgw(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgw> a();

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$2.a($$0, $$1, je.b, dmv.c);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!this.c((dbw)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dbt)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), exh.b);
            }
         }
      }
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if ($$0.a((dbw)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dpc $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (je $$7 : je.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dbt $$0, iz $$1, drx $$2) {
      if (!this.c((dbw)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            exh $$5 = exh.c;
            if (this.b((daz)$$0, $$1, $$2)) {
               $$5 = exh.a;
            } else if ($$3) {
               $$5 = exh.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dbw $$0, iz $$1, drx $$2) {
      return false;
   }

   protected boolean a(dbt $$0, iz $$1, drx $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dbt $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(aE);
      iz $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         drx $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dew.cw) ? $$6.c(dkw.f) : 0);
      }
   }

   protected int a(dcj $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(aE);
      je $$4 = $$3.h();
      je $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dbt $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(aE);
      iz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(daz $$0, iz $$1, drx $$2) {
      return 15;
   }

   public static boolean m(drx $$0) {
      return $$0.b() instanceof dgw;
   }

   public boolean b(daz $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(aE).g();
      drx $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(drx var1);
}
