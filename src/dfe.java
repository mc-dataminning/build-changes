import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dfe extends dfa implements bik {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private il<ckj> s = il.a(27, ckj.b);
   private int t;
   private dfe.a u = dfe.a.a;
   private float v;
   private float w;
   @Nullable
   private final cix x;

   public dfe(@Nullable cix $$0, ht $$1, dgb $$2) {
      super(ddz.x, $$1, $$2);
      this.x = $$0;
   }

   public dfe(ht $$0, dgb $$1) {
      super(ddz.x, $$0, $$1);
      this.x = dax.a($$1.b());
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dfe $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cqz $$0, ht $$1, dgb $$2) {
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
               this.u = dfe.a.c;
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
               this.u = dfe.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dfe.a i() {
      return this.u;
   }

   public eia a(dgb $$0) {
      return car.a($$0.c(dax.b), 0.5F * this.a(1.0F));
   }

   private void c(cqz $$0, ht $$1, dgb $$2) {
      if ($$2.b() instanceof dax) {
         hx $$3 = $$2.c(dax.b);
         eia $$4 = car.a($$3, this.w, this.v).a($$1);
         List<bjt> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bjt $$6 : $$5) {
               if ($$6.r_() != ebj.d) {
                  $$6.a(bkp.d, new eif(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dfe.a.d;
         }

         if ($$1 == 1) {
            this.u = dfe.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cqz $$0, ht $$1, dgb $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dkl.k, this.p);
            this.o.a(null, this.p, aqd.vc, aqe.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dkl.j, this.p);
            this.o.a(null, this.p, aqd.vb, aqe.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected ui g() {
      return ui.c("container.shulkerBox");
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bhv.a($$0, this.s, false);
      }
   }

   public void f(rt $$0) {
      this.s = il.a(this.b(), ckj.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bhv.b($$0, this.s);
      }
   }

   @Override
   protected il<ckj> f() {
      return this.s;
   }

   @Override
   protected void a(il<ckj> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hx $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, ckj $$1, @Nullable hx $$2) {
      return !(cua.a($$1.d()) instanceof dax);
   }

   @Override
   public boolean b(int $$0, ckj $$1, hx $$2) {
      return true;
   }

   public float a(float $$0) {
      return asy.i($$0, this.w, this.v);
   }

   @Nullable
   public cix j() {
      return this.x;
   }

   @Override
   protected cfp a(int $$0, ccw $$1) {
      return new che($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dfe.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
