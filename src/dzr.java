import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dzr extends dzn implements bvd {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jp<daa> q = jp.a(27, daa.k);
   private int r;
   private dzr.a s = dzr.a.a;
   private float t;
   private float u;
   @Nullable
   private final cyy v;

   public dzr(@Nullable cyy $$0, iw $$1, ebg $$2) {
      super(dyg.y, $$1, $$2);
      this.v = $$0;
   }

   public dzr(iw $$0, ebg $$1) {
      super(dyg.y, $$0, $$1);
      this.v = $$1.b() instanceof dun $$2 ? $$2.b() : null;
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzr $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(djz $$0, iw $$1, ebg $$2) {
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
               this.s = dzr.a.c;
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
               this.s = dzr.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dzr.a k() {
      return this.s;
   }

   public ffn a(ebg $$0) {
      ffs $$1 = new ffs(0.5, 0.0, 0.5);
      return cph.a(1.0F, $$0.c(dun.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(djz $$0, iw $$1, ebg $$2) {
      if ($$2.b() instanceof dun) {
         jc $$3 = $$2.c(dun.c);
         ffn $$4 = cph.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bwv> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bwv $$6 : $$5) {
               if ($$6.j_() != exv.d) {
                  $$6.a(bya.d, new ffs(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dzr.a.d;
         }

         if ($$1 == 1) {
            this.s = dzr.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(djz $$0, iw $$1, ebg $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(iw $$0, ebg $$1) {
   }

   @Override
   public void c_(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, egg.k, this.o);
            this.n.a(null, this.o, awr.xD, aws.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(crz $$0) {
      if (!this.p && !$$0.Z_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, egg.j, this.o);
            this.n.a(null, this.o, awr.xC, aws.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xc j() {
      return xc.c("container.shulkerBox");
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bun.a($$0, this.q, false, $$1);
      }
   }

   public void e(ua $$0, ji.a $$1) {
      this.q = jp.a(this.b(), daa.k);
      if (!this.b_($$0)) {
         bun.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jp<daa> f() {
      return this.q;
   }

   @Override
   protected void a(jp<daa> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jc $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, daa $$1, @Nullable jc $$2) {
      return !(dne.a($$1.h()) instanceof dun);
   }

   @Override
   public boolean b(int $$0, daa $$1, jc $$2) {
      return true;
   }

   public float a(float $$0) {
      return azq.h($$0, this.u, this.t);
   }

   @Nullable
   public cyy s() {
      return this.v;
   }

   @Override
   protected cvs a(int $$0, cry $$1) {
      return new cxm($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dzr.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
