import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djl extends dlf {
   protected static final ezm c = dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dvf d = dve.w;

   protected djl(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djl> a();

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dej $$0, je $$1, duo $$2) {
      return $$2.a($$0, $$1, jj.b, dpl.c);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!this.c((dej)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((deg)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fao.b);
            }
         }
      }
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$0.a((dej)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         drs $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jj $$7 : jj.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(deg $$0, je $$1, duo $$2) {
      if (!this.c((dej)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.R().b($$1, this)) {
            fao $$5 = fao.c;
            if (this.b((ddl)$$0, $$1, $$2)) {
               $$5 = fao.a;
            } else if ($$3) {
               $$5 = fao.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dej $$0, je $$1, duo $$2) {
      return false;
   }

   protected boolean a(deg $$0, je $$1, duo $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(deg $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(aF);
      je $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         duo $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dhl.cw) ? $$6.c(dnm.f) : 0);
      }
   }

   protected int a(dex $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(aF);
      jj $$4 = $$3.h();
      jj $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(aF, $$0.g().g());
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(deg $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(aF);
      je $$4 = $$1.a($$3.g());
      erx $$5 = ert.a($$0, $$3.g(), jj.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(ddl $$0, je $$1, duo $$2) {
      return 15;
   }

   public static boolean n(duo $$0) {
      return $$0.b() instanceof djl;
   }

   public boolean b(ddl $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(aF).g();
      duo $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(duo var1);
}
