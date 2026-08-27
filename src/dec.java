import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dec extends ddy implements bhh {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hp<cjf> s = hp.a(27, cjf.b);
   private int t;
   private dec.a u = dec.a.a;
   private float v;
   private float w;
   @Nullable
   private final cht x;

   public dec(@Nullable cht $$0, gw $$1, dfj $$2) {
      super(dcx.x, $$1, $$2);
      this.x = $$0;
   }

   public dec(gw $$0, dfj $$1) {
      super(dcx.x, $$0, $$1);
      this.x = czu.a($$1.b());
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, dec $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cpv $$0, gw $$1, dfj $$2) {
      this.w = this.v;
      switch (this.u) {
         case a:
            this.v = 0.0F;
            break;
         case b:
            this.v += 0.1F;
            if (this.w == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v >= 1.0F) {
               this.u = dec.a.c;
               this.v = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.v -= 0.1F;
            if (this.w == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v <= 0.0F) {
               this.u = dec.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dec.a i() {
      return this.u;
   }

   public ehi a(dfj $$0) {
      return bzo.a($$0.c(czu.a), 0.5F * this.a(1.0F));
   }

   private void c(cpv $$0, gw $$1, dfj $$2) {
      if ($$2.b() instanceof czu) {
         hc $$3 = $$2.c(czu.a);
         ehi $$4 = bzo.a($$3, this.w, this.v).a($$1);
         List<biq> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (biq $$6 : $$5) {
               if ($$6.q_() != ear.d) {
                  $$6.a(bjm.d, new ehn(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.s.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.t = $$1;
         if ($$1 == 0) {
            this.u = dec.a.d;
         }

         if ($$1 == 1) {
            this.u = dec.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cpv $$0, gw $$1, dfj $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, djt.k, this.p);
            this.o.a(null, this.p, ape.va, apf.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, djt.j, this.p);
            this.o.a(null, this.p, ape.uZ, apf.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected tm g() {
      return tm.c("container.shulkerBox");
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgs.a($$0, this.s, false);
      }
   }

   public void f(qy $$0) {
      this.s = hp.a(this.b(), cjf.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgs.b($$0, this.s);
      }
   }

   @Override
   protected hp<cjf> f() {
      return this.s;
   }

   @Override
   protected void a(hp<cjf> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hc $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cjf $$1, @Nullable hc $$2) {
      return !(csv.a($$1.d()) instanceof czu);
   }

   @Override
   public boolean b(int $$0, cjf $$1, hc $$2) {
      return true;
   }

   public float a(float $$0) {
      return arx.i($$0, this.w, this.v);
   }

   @Nullable
   public cht j() {
      return this.x;
   }

   @Override
   protected cel a(int $$0, cbt $$1) {
      return new cga($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dec.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
