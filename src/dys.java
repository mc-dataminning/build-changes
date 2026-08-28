import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dys extends dyo implements bun {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jn<czd> q = jn.a(27, czd.k);
   private int r;
   private dys.a s = dys.a.a;
   private float t;
   private float u;
   @Nullable
   private final cyb v;

   public dys(@Nullable cyb $$0, iu $$1, eah $$2) {
      super(dxh.y, $$1, $$2);
      this.v = $$0;
   }

   public dys(iu $$0, eah $$1) {
      super(dxh.y, $$0, $$1);
      this.v = $$1.b() instanceof dto $$2 ? $$2.b() : null;
   }

   public static void a(dja $$0, iu $$1, eah $$2, dys $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dja $$0, iu $$1, eah $$2) {
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
               this.s = dys.a.c;
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
               this.s = dys.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dys.a k() {
      return this.s;
   }

   public fel a(eah $$0) {
      feq $$1 = new feq(0.5, 0.0, 0.5);
      return coj.a(1.0F, $$0.c(dto.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dja $$0, iu $$1, eah $$2) {
      if ($$2.b() instanceof dto) {
         ja $$3 = $$2.c(dto.c);
         fel $$4 = coj.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bwf> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bwf $$6 : $$5) {
               if ($$6.j_() != ewt.d) {
                  $$6.a(bxi.d, new feq(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dys.a.d;
         }

         if ($$1 == 1) {
            this.s = dys.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dja $$0, iu $$1, eah $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(iu $$0, eah $$1) {
   }

   @Override
   public void c_(crc $$0) {
      if (!this.p && !$$0.V_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, efh.k, this.o);
            this.n.a(null, this.o, awn.xD, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, efh.j, this.o);
            this.n.a(null, this.o, awn.xC, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wy j() {
      return wy.c("container.shulkerBox");
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btx.a($$0, this.q, false, $$1);
      }
   }

   public void e(tz $$0, jg.a $$1) {
      this.q = jn.a(this.b(), czd.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         btx.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jn<czd> f() {
      return this.q;
   }

   @Override
   protected void a(jn<czd> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(ja $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, czd $$1, @Nullable ja $$2) {
      return !(dmf.a($$1.h()) instanceof dto);
   }

   @Override
   public boolean b(int $$0, czd $$1, ja $$2) {
      return true;
   }

   public float a(float $$0) {
      return azm.h($$0, this.u, this.t);
   }

   @Nullable
   public cyb s() {
      return this.v;
   }

   @Override
   protected cuv a(int $$0, crb $$1) {
      return new cwp($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dys.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
