import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dee extends dea implements bhj {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hp<cjh> s = hp.a(27, cjh.b);
   private int t;
   private dee.a u = dee.a.a;
   private float v;
   private float w;
   @Nullable
   private final chv x;

   public dee(@Nullable chv $$0, gw $$1, dfl $$2) {
      super(dcz.x, $$1, $$2);
      this.x = $$0;
   }

   public dee(gw $$0, dfl $$1) {
      super(dcz.x, $$0, $$1);
      this.x = czw.a($$1.b());
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, dee $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cpx $$0, gw $$1, dfl $$2) {
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
               this.u = dee.a.c;
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
               this.u = dee.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dee.a i() {
      return this.u;
   }

   public ehk a(dfl $$0) {
      return bzq.a($$0.c(czw.a), 0.5F * this.a(1.0F));
   }

   private void c(cpx $$0, gw $$1, dfl $$2) {
      if ($$2.b() instanceof czw) {
         hc $$3 = $$2.c(czw.a);
         ehk $$4 = bzq.a($$3, this.w, this.v).a($$1);
         List<bis> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bis $$6 : $$5) {
               if ($$6.q_() != eat.d) {
                  $$6.a(bjo.d, new ehp(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dee.a.d;
         }

         if ($$1 == 1) {
            this.u = dee.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cpx $$0, gw $$1, dfl $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, djv.k, this.p);
            this.o.a(null, this.p, apf.va, apg.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, djv.j, this.p);
            this.o.a(null, this.p, apf.uZ, apg.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected tn g() {
      return tn.c("container.shulkerBox");
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
         bgu.a($$0, this.s, false);
      }
   }

   public void f(qy $$0) {
      this.s = hp.a(this.b(), cjh.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgu.b($$0, this.s);
      }
   }

   @Override
   protected hp<cjh> f() {
      return this.s;
   }

   @Override
   protected void a(hp<cjh> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hc $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cjh $$1, @Nullable hc $$2) {
      return !(csx.a($$1.d()) instanceof czw);
   }

   @Override
   public boolean b(int $$0, cjh $$1, hc $$2) {
      return true;
   }

   public float a(float $$0) {
      return ary.i($$0, this.w, this.v);
   }

   @Nullable
   public chv j() {
      return this.x;
   }

   @Override
   protected cen a(int $$0, cbv $$1) {
      return new cgc($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dee.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
