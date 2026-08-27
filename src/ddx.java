import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddx extends ddt implements bhc {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hp<cja> s = hp.a(27, cja.b);
   private int t;
   private ddx.a u = ddx.a.a;
   private float v;
   private float w;
   @Nullable
   private final cho x;

   public ddx(@Nullable cho $$0, gw $$1, dfe $$2) {
      super(dcs.x, $$1, $$2);
      this.x = $$0;
   }

   public ddx(gw $$0, dfe $$1) {
      super(dcs.x, $$0, $$1);
      this.x = czp.a($$1.b());
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, ddx $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cpq $$0, gw $$1, dfe $$2) {
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
               this.u = ddx.a.c;
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
               this.u = ddx.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public ddx.a i() {
      return this.u;
   }

   public ehd a(dfe $$0) {
      return bzj.a($$0.c(czp.a), 0.5F * this.a(1.0F));
   }

   private void c(cpq $$0, gw $$1, dfe $$2) {
      if ($$2.b() instanceof czp) {
         hc $$3 = $$2.c(czp.a);
         ehd $$4 = bzj.a($$3, this.w, this.v).a($$1);
         List<bil> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bil $$6 : $$5) {
               if ($$6.l_() != eam.d) {
                  $$6.a(bjh.d, new ehi(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = ddx.a.d;
         }

         if ($$1 == 1) {
            this.u = ddx.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cpq $$0, gw $$1, dfe $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, djo.k, this.p);
            this.o.a(null, this.p, aoz.va, apa.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, djo.j, this.p);
            this.o.a(null, this.p, aoz.uZ, apa.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected ti g() {
      return ti.c("container.shulkerBox");
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgn.a($$0, this.s, false);
      }
   }

   public void f(qu $$0) {
      this.s = hp.a(this.b(), cja.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgn.b($$0, this.s);
      }
   }

   @Override
   protected hp<cja> f() {
      return this.s;
   }

   @Override
   protected void a(hp<cja> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hc $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cja $$1, @Nullable hc $$2) {
      return !(csq.a($$1.d()) instanceof czp);
   }

   @Override
   public boolean b(int $$0, cja $$1, hc $$2) {
      return true;
   }

   public float a(float $$0) {
      return ars.i($$0, this.w, this.v);
   }

   @Nullable
   public cho j() {
      return this.x;
   }

   @Override
   protected ceg a(int $$0, cbo $$1) {
      return new cfv($$0, $$1, this);
   }

   public boolean v() {
      return this.u == ddx.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
