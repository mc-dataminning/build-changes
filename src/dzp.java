import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dzp extends dzl implements bvb {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jo<czy> q = jo.a(27, czy.k);
   private int r;
   private dzp.a s = dzp.a.a;
   private float t;
   private float u;
   @Nullable
   private final cyw v;

   public dzp(@Nullable cyw $$0, iv $$1, ebe $$2) {
      super(dye.y, $$1, $$2);
      this.v = $$0;
   }

   public dzp(iv $$0, ebe $$1) {
      super(dye.y, $$0, $$1);
      this.v = $$1.b() instanceof dul $$2 ? $$2.b() : null;
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dzp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(djx $$0, iv $$1, ebe $$2) {
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
               this.s = dzp.a.c;
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
               this.s = dzp.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dzp.a k() {
      return this.s;
   }

   public ffl a(ebe $$0) {
      ffq $$1 = new ffq(0.5, 0.0, 0.5);
      return cpf.a(1.0F, $$0.c(dul.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(djx $$0, iv $$1, ebe $$2) {
      if ($$2.b() instanceof dul) {
         jb $$3 = $$2.c(dul.c);
         ffl $$4 = cpf.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bwt> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bwt $$6 : $$5) {
               if ($$6.j_() != ext.d) {
                  $$6.a(bxy.d, new ffq(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dzp.a.d;
         }

         if ($$1 == 1) {
            this.s = dzp.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(djx $$0, iv $$1, ebe $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(iv $$0, ebe $$1) {
   }

   @Override
   public void c_(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, ege.k, this.o);
            this.n.a(null, this.o, awp.xD, awq.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(crx $$0) {
      if (!this.p && !$$0.Z_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, ege.j, this.o);
            this.n.a(null, this.o, awp.xC, awq.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xa j() {
      return xa.c("container.shulkerBox");
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bul.a($$0, this.q, false, $$1);
      }
   }

   public void e(tz $$0, jh.a $$1) {
      this.q = jo.a(this.b(), czy.k);
      if (!this.b_($$0)) {
         bul.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jo<czy> f() {
      return this.q;
   }

   @Override
   protected void a(jo<czy> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jb $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, czy $$1, @Nullable jb $$2) {
      return !(dnc.a($$1.h()) instanceof dul);
   }

   @Override
   public boolean b(int $$0, czy $$1, jb $$2) {
      return true;
   }

   public float a(float $$0) {
      return azo.h($$0, this.u, this.t);
   }

   @Nullable
   public cyw s() {
      return this.v;
   }

   @Override
   protected cvq a(int $$0, crw $$1) {
      return new cxk($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dzp.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
