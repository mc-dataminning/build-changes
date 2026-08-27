import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class deg extends dec implements bhn {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hn<cjl> s = hn.a(27, cjl.b);
   private int t;
   private deg.a u = deg.a.a;
   private float v;
   private float w;
   @Nullable
   private final chz x;

   public deg(@Nullable chz $$0, gw $$1, dfd $$2) {
      super(ddb.x, $$1, $$2);
      this.x = $$0;
   }

   public deg(gw $$0, dfd $$1) {
      super(ddb.x, $$0, $$1);
      this.x = czz.a($$1.b());
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, deg $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cqb $$0, gw $$1, dfd $$2) {
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
               this.u = deg.a.c;
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
               this.u = deg.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public deg.a i() {
      return this.u;
   }

   public ehc a(dfd $$0) {
      return bzu.a($$0.c(czz.b), 0.5F * this.a(1.0F));
   }

   private void c(cqb $$0, gw $$1, dfd $$2) {
      if ($$2.b() instanceof czz) {
         ha $$3 = $$2.c(czz.b);
         ehc $$4 = bzu.a($$3, this.w, this.v).a($$1);
         List<biw> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (biw $$6 : $$5) {
               if ($$6.q_() != eal.d) {
                  $$6.a(bjs.d, new ehh(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = deg.a.d;
         }

         if ($$1 == 1) {
            this.u = deg.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cqb $$0, gw $$1, dfd $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cca $$0) {
      if (!this.q && !$$0.M_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, djn.k, this.p);
            this.o.a(null, this.p, apg.va, aph.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cca $$0) {
      if (!this.q && !$$0.M_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, djn.j, this.p);
            this.o.a(null, this.p, apg.uZ, aph.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected tl g() {
      return tl.c("container.shulkerBox");
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgy.a($$0, this.s, false);
      }
   }

   public void f(qw $$0) {
      this.s = hn.a(this.b(), cjl.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgy.b($$0, this.s);
      }
   }

   @Override
   protected hn<cjl> f() {
      return this.s;
   }

   @Override
   protected void a(hn<cjl> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ha $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cjl $$1, @Nullable ha $$2) {
      return !(ctc.a($$1.d()) instanceof czz);
   }

   @Override
   public boolean b(int $$0, cjl $$1, ha $$2) {
      return true;
   }

   public float a(float $$0) {
      return asb.i($$0, this.w, this.v);
   }

   @Nullable
   public chz j() {
      return this.x;
   }

   @Override
   protected cer a(int $$0, cbz $$1) {
      return new cgg($$0, $$1, this);
   }

   public boolean v() {
      return this.u == deg.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
