import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dks extends dml {
   protected static final fas c = diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dwm d = dwl.w;

   protected dks(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dks> a();

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$2.a($$0, $$1, jm.b, dqr.c);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!this.c((dfp)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dfm)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fbu.b);
            }
         }
      }
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$0.a((dfp)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dsy $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dfm $$0, jh $$1, dvv $$2) {
      if (!this.c((dfp)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.S().b($$1, this)) {
            fbu $$5 = fbu.c;
            if (this.b((der)$$0, $$1, $$2)) {
               $$5 = fbu.a;
            } else if ($$3) {
               $$5 = fbu.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dfp $$0, jh $$1, dvv $$2) {
      return false;
   }

   protected boolean a(dfm $$0, jh $$1, dvv $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dfm $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dvv $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dis.cw) ? $$6.c(dos.f) : 0);
      }
   }

   protected int a(dge $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dfm $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      etd $$5 = esz.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(der $$0, jh $$1, dvv $$2) {
      return 15;
   }

   public static boolean n(dvv $$0) {
      return $$0.b() instanceof dks;
   }

   public boolean b(der $$0, jh $$1, dvv $$2) {
      jm $$3 = $$2.c(aF).g();
      dvv $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dvv var1);
}
