import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dsp extends dsl implements bru {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jw<cvl> n = jw.a(27, cvl.k);
   private int r;
   private dsp.a s = dsp.a.a;
   private float t;
   private float u;
   @Nullable
   private final cue v;

   public dsp(@Nullable cue $$0, je $$1, dua $$2) {
      super(drg.x, $$1, $$2);
      this.v = $$0;
   }

   public dsp(je $$0, dua $$1) {
      super(drg.x, $$0, $$1);
      this.v = dnv.a($$1.b());
   }

   public static void a(dds $$0, je $$1, dua $$2, dsp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dds $$0, je $$1, dua $$2) {
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
               this.s = dsp.a.c;
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
               this.s = dsp.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dsp.a k() {
      return this.s;
   }

   public exz a(dua $$0) {
      return clb.a(1.0F, $$0.c(dnv.b), 0.5F * this.a(1.0F));
   }

   private void c(dds $$0, je $$1, dua $$2) {
      if ($$2.b() instanceof dnv) {
         jj $$3 = $$2.c(dnv.b);
         exz $$4 = clb.a(1.0F, $$3, this.u, this.t).a($$1);
         List<btj> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (btj $$6 : $$5) {
               if ($$6.j_() != eqg.d) {
                  $$6.a(buj.d, new eye(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.n.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = dsp.a.d;
         }

         if ($$1 == 1) {
            this.s = dsp.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dds $$0, je $$1, dua $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, dyx.k, this.p);
            this.o.a(null, this.p, awd.wO, awe.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, dyx.j, this.p);
            this.o.a(null, this.p, awd.wN, awe.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xd j() {
      return xd.c("container.shulkerBox");
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bre.a($$0, this.n, false, $$1);
      }
   }

   public void e(uf $$0, jp.a $$1) {
      this.n = jw.a(this.b(), cvl.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bre.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jw<cvl> f() {
      return this.n;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jj $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cvl $$1, @Nullable jj $$2) {
      return !(dgv.a($$1.h()) instanceof dnv);
   }

   @Override
   public boolean b(int $$0, cvl $$1, jj $$2) {
      return true;
   }

   public float a(float $$0) {
      return azc.h($$0, this.u, this.t);
   }

   @Nullable
   public cue t() {
      return this.v;
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return new csk($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dsp.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
