import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dov extends dor implements bpy {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jf<csz> q = jf.a(27, csz.i);
   private int r;
   private dov.a s = dov.a.a;
   private float t;
   private float u;
   @Nullable
   private final crs v;

   public dov(@Nullable crs $$0, in $$1, dqh $$2) {
      super(dno.x, $$1, $$2);
      this.v = $$0;
   }

   public dov(in $$0, dqh $$1) {
      super(dno.x, $$0, $$1);
      this.v = dkd.a($$1.b());
   }

   public static void a(dad $$0, in $$1, dqh $$2, dov $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dad $$0, in $$1, dqh $$2) {
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
               this.s = dov.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = dov.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.t = 1.0F;
      }
   }

   public dov.a l() {
      return this.s;
   }

   public etk a(dqh $$0) {
      return cit.a(1.0F, $$0.c(dkd.b), 0.5F * this.a(1.0F));
   }

   private void c(dad $$0, in $$1, dqh $$2) {
      if ($$2.b() instanceof dkd) {
         is $$3 = $$2.c(dkd.b);
         etk $$4 = cit.a(1.0F, $$3, this.u, this.t).a($$1);
         List<brh> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (brh $$6 : $$5) {
               if ($$6.k_() != emf.d) {
                  $$6.a(bsf.d, new etp(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = dov.a.d;
         }

         if ($$1 == 1) {
            this.s = dov.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dad $$0, in $$1, dqh $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(clh $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dva.k, this.o);
            this.n.a(null, this.o, avc.wz, avd.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dva.j, this.o);
            this.n.a(null, this.o, avc.wy, avd.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wu k() {
      return wu.c("container.shulkerBox");
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.c($$0, $$1);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpg.a($$0, this.q, false, $$1);
      }
   }

   public void c(ua $$0, iy.a $$1) {
      this.q = jf.a(this.b(), csz.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bpg.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jf<csz> j() {
      return this.q;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(is $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, csz $$1, @Nullable is $$2) {
      return !(dde.a($$1.f()) instanceof dkd);
   }

   @Override
   public boolean b(int $$0, csz $$1, is $$2) {
      return true;
   }

   public float a(float $$0) {
      return axz.i($$0, this.u, this.t);
   }

   @Nullable
   public crs t() {
      return this.v;
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return new cpw($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dov.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
