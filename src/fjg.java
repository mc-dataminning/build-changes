import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fjg {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private dek g;
   private bui h;
   private ezr i = ezr.c;
   private final jh.a j = new jh.a();
   private final Vector3f k = new Vector3f(c);
   private final Vector3f l = new Vector3f(d);
   private final Vector3f m = new Vector3f(e);
   private float n;
   private float o;
   private final Quaternionf p = new Quaternionf();
   private boolean q;
   private float r;
   private float s;
   private float t;
   public static final float a = 0.083333336F;

   public void a(dek $$0, bui $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      if ($$1.cb() && $$1.dm() instanceof cqu $$5 && $$5.m() instanceof crc $$6 && $$6.u()) {
         ezr $$7 = $$5.m($$1).d($$5.dw()).d($$1.l($$5)).e(new ezr(0.0, (double)azn.h($$4, this.s, this.r), 0.0));
         this.a($$1.i($$4), $$1.h($$4));
         this.a($$6.e($$4).e($$7));
      } else {
         this.a($$1.i($$4), $$1.h($$4));
         this.a(
            azn.d((double)$$4, $$1.L, $$1.dD()), azn.d((double)$$4, $$1.M, $$1.dF()) + (double)azn.h($$4, this.s, this.r), azn.d((double)$$4, $$1.N, $$1.dJ())
         );
      }

      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$9 = $$1 instanceof bve $$8 ? $$8.em() : 1.0F;
         this.a(-this.a(4.0F * $$9), 0.0F, 0.0F);
      } else if ($$1 instanceof bve && ((bve)$$1).fU()) {
         jm $$10 = ((bve)$$1).fW();
         this.a($$10 != null ? $$10.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0F, 0.3F, 0.0F);
      }
   }

   public void a() {
      if (this.h != null) {
         this.s = this.r;
         this.r = this.r + (this.h.cU() - this.r) * 0.5F;
      }
   }

   private float a(float $$0) {
      float $$1 = 0.1F;

      for (int $$2 = 0; $$2 < 8; $$2++) {
         float $$3 = (float)(($$2 & 1) * 2 - 1);
         float $$4 = (float)(($$2 >> 1 & 1) * 2 - 1);
         float $$5 = (float)(($$2 >> 2 & 1) * 2 - 1);
         ezr $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         ezr $$7 = $$6.e(new ezr(this.k).c((double)(-$$0)));
         ezp $$8 = this.g.a(new den($$6, $$7, den.a.c, den.b.a, this.h));
         if ($$8.d() != ezp.a.a) {
            float $$9 = (float)$$8.g().g(this.i);
            if ($$9 < azn.l($$0)) {
               $$0 = azn.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new ezr(this.i.d + (double)$$3.x, this.i.e + (double)$$3.y, this.i.f + (double)$$3.z));
   }

   protected void a(float $$0, float $$1) {
      this.n = $$1;
      this.o = $$0;
      this.p.rotationYXZ((float) Math.PI - $$0 * (float) (Math.PI / 180.0), -$$1 * (float) (Math.PI / 180.0), 0.0F);
      c.rotate(this.p, this.k);
      d.rotate(this.p, this.l);
      e.rotate(this.p, this.m);
   }

   protected void a(double $$0, double $$1, double $$2) {
      this.a(new ezr($$0, $$1, $$2));
   }

   protected void a(ezr $$0) {
      this.i = $$0;
      this.j.b($$0.d, $$0.e, $$0.f);
   }

   public ezr b() {
      return this.i;
   }

   public jh c() {
      return this.j;
   }

   public float d() {
      return this.n;
   }

   public float e() {
      return this.o;
   }

   public Quaternionf f() {
      return this.p;
   }

   public bui g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public fjg.a j() {
      fjx $$0 = fjx.Q();
      double $$1 = (double)$$0.aO().k() / (double)$$0.aO().l();
      double $$2 = Math.tan((double)((float)$$0.n.aj().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      ezr $$4 = new ezr(this.k).c(0.05F);
      ezr $$5 = new ezr(this.m).c($$3);
      ezr $$6 = new ezr(this.l).c($$2);
      return new fjg.a($$4, $$5, $$6);
   }

   public erq k() {
      if (!this.f) {
         return erq.d;
      } else {
         ero $$0 = this.g.b_(this.j);
         if ($$0.a(axj.a) && this.i.e < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return erq.b;
         } else {
            fjg.a $$1 = this.j();

            for (ezr $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               ezr $$4 = this.i.e($$3);
               jh $$5 = jh.a((ka)$$4);
               ero $$6 = this.g.b_($$5);
               if ($$6.a(axj.b)) {
                  if ($$4.e <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return erq.a;
                  }
               } else {
                  dvo $$7 = this.g.a_($$5);
                  if ($$7.a(dil.qP)) {
                     return erq.c;
                  }
               }
            }

            return erq.d;
         }
      }
   }

   public final Vector3f l() {
      return this.k;
   }

   public final Vector3f m() {
      return this.l;
   }

   public final Vector3f n() {
      return this.m;
   }

   public void o() {
      this.g = null;
      this.h = null;
      this.f = false;
   }

   public float p() {
      return this.t;
   }

   public static class a {
      final ezr a;
      private final ezr b;
      private final ezr c;

      a(ezr $$0, ezr $$1, ezr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ezr a() {
         return this.a.e(this.c).e(this.b);
      }

      public ezr b() {
         return this.a.e(this.c).d(this.b);
      }

      public ezr c() {
         return this.a.d(this.c).e(this.b);
      }

      public ezr d() {
         return this.a.d(this.c).d(this.b);
      }

      public ezr a(float $$0, float $$1) {
         return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
      }
   }
}
