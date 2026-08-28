import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dka extends dlt {
   protected static final fab c = dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dvu d = dvt.w;

   protected dka(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dka> a();

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$2.a($$0, $$1, jl.b, dpz.c);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!this.c((dey)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dev)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fbd.b);
            }
         }
      }
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$0.a((dey)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dsg $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jl $$7 : jl.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dev $$0, jg $$1, dvd $$2) {
      if (!this.c((dey)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.R().b($$1, this)) {
            fbd $$5 = fbd.c;
            if (this.b((dea)$$0, $$1, $$2)) {
               $$5 = fbd.a;
            } else if ($$3) {
               $$5 = fbd.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dey $$0, jg $$1, dvd $$2) {
      return false;
   }

   protected boolean a(dev $$0, jg $$1, dvd $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dev $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(aF);
      jg $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dvd $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dia.cw) ? $$6.c(doa.f) : 0);
      }
   }

   protected int a(dfm $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(aF);
      jl $$4 = $$3.h();
      jl $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dev $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(aF);
      jg $$4 = $$1.a($$3.g());
      esm $$5 = esi.a($$0, $$3.g(), jl.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dea $$0, jg $$1, dvd $$2) {
      return 15;
   }

   public static boolean n(dvd $$0) {
      return $$0.b() instanceof dka;
   }

   public boolean b(dea $$0, jg $$1, dvd $$2) {
      jl $$3 = $$2.c(aF).g();
      dvd $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dvd var1);
}
