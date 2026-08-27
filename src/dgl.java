import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dgl extends dgh implements bjh {
   public static final int c = 9;
   public static final int d = 3;
   public static final int e = 27;
   public static final int f = 1;
   public static final int g = 10;
   public static final float h = 0.5F;
   public static final float i = 270.0F;
   public static final String j = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private il<clj> s = il.a(27, clj.b);
   private int t;
   private dgl.a u = dgl.a.a;
   private float v;
   private float w;
   @Nullable
   private final cjx x;

   public dgl(@Nullable cjx $$0, ht $$1, dhi $$2) {
      super(dff.x, $$1, $$2);
      this.x = $$0;
   }

   public dgl(ht $$0, dhi $$1) {
      super(dff.x, $$0, $$1);
      this.x = dby.a($$1.b());
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dgl $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(csa $$0, ht $$1, dhi $$2) {
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
               this.u = dgl.a.c;
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
               this.u = dgl.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dgl.a i() {
      return this.u;
   }

   public ejp a(dhi $$0) {
      return cbo.a($$0.c(dby.b), 0.5F * this.a(1.0F));
   }

   private void c(csa $$0, ht $$1, dhi $$2) {
      if ($$2.b() instanceof dby) {
         hx $$3 = $$2.c(dby.b);
         ejp $$4 = cbo.a($$3, this.w, this.v).a($$1);
         List<bkq> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bkq $$6 : $$5) {
               if ($$6.r_() != ecx.d) {
                  $$6.a(blm.d, new eju(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dgl.a.d;
         }

         if ($$1 == 1) {
            this.u = dgl.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(csa $$0, ht $$1, dhi $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dls.k, this.p);
            this.o.a(null, this.p, aqr.vv, aqs.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dls.j, this.p);
            this.o.a(null, this.p, aqr.vu, aqs.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected ur g() {
      return ur.c("container.shulkerBox");
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bir.a($$0, this.s, false);
      }
   }

   public void f(rz $$0) {
      this.s = il.a(this.b(), clj.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bir.b($$0, this.s);
      }
   }

   @Override
   protected il<clj> f() {
      return this.s;
   }

   @Override
   protected void a(il<clj> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hx $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, clj $$1, @Nullable hx $$2) {
      return !(cva.a($$1.d()) instanceof dby);
   }

   @Override
   public boolean b(int $$0, clj $$1, hx $$2) {
      return true;
   }

   public float a(float $$0) {
      return atm.i($$0, this.w, this.v);
   }

   @Nullable
   public cjx j() {
      return this.x;
   }

   @Override
   protected cgm a(int $$0, cdt $$1) {
      return new cie($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dgl.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
