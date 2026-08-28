import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class duj extends duf implements bsu {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jz<cwm> n = jz.a(27, cwm.k);
   private int r;
   private duj.a s = duj.a.a;
   private float t;
   private float u;
   @Nullable
   private final cvj v;

   public duj(@Nullable cvj $$0, jh $$1, dvv $$2) {
      super(dta.x, $$1, $$2);
      this.v = $$0;
   }

   public duj(jh $$0, dvv $$1) {
      super(dta.x, $$0, $$1);
      this.v = dpp.a($$1.b());
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, duj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dfm $$0, jh $$1, dvv $$2) {
      this.u = this.t;
      switch (this.s) {
         case a:
            this.t = 0.0F;
            break;
         case b:
            this.t += 0.1F;
            if (this.u == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t >= 1.0F) {
               this.s = duj.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case c:
            this.t = 1.0F;
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = duj.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public duj.a k() {
      return this.s;
   }

   public ezt a(dvv $$0) {
      return cme.a(1.0F, $$0.c(dpp.b), 0.5F * this.a(1.0F));
   }

   private void c(dfm $$0, jh $$1, dvv $$2) {
      if ($$2.b() instanceof dpp) {
         jm $$3 = $$2.c(dpp.b);
         ezt $$4 = cme.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bul> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bul $$6 : $$5) {
               if ($$6.m_() != esa.d) {
                  $$6.a(bvl.d, new ezy(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.n.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = duj.a.d;
         }

         if ($$1 == 1) {
            this.s = duj.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dfm $$0, jh $$1, dvv $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, ear.k, this.p);
            this.o.a(null, this.p, awn.wM, awo.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cou $$0) {
      if (!this.q && !$$0.Y_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, ear.j, this.p);
            this.o.a(null, this.p, awn.wL, awo.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xj j() {
      return xj.c("container.shulkerBox");
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bse.a($$0, this.n, false, $$1);
      }
   }

   public void e(ul $$0, js.a $$1) {
      this.n = jz.a(this.b(), cwm.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bse.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jz<cwm> f() {
      return this.n;
   }

   @Override
   protected void a(jz<cwm> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jm $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwm $$1, @Nullable jm $$2) {
      return !(diq.a($$1.h()) instanceof dpp);
   }

   @Override
   public boolean b(int $$0, cwm $$1, jm $$2) {
      return true;
   }

   public float a(float $$0) {
      return azm.h($$0, this.u, this.t);
   }

   @Nullable
   public cvj t() {
      return this.v;
   }

   @Override
   protected crz a(int $$0, cot $$1) {
      return new ctt($$0, $$1, this);
   }

   public boolean u() {
      return this.s == duj.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
