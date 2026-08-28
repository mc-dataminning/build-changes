import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffg {
   private static final float b = 4.0F;
   private boolean c;
   private dbm d;
   private bsh e;
   private ewh f = ewh.b;
   private final ja.a g = new ja.a();
   private final Vector3f h = new Vector3f(0.0F, 0.0F, 1.0F);
   private final Vector3f i = new Vector3f(0.0F, 1.0F, 0.0F);
   private final Vector3f j = new Vector3f(1.0F, 0.0F, 0.0F);
   private float k;
   private float l;
   private final Quaternionf m = new Quaternionf(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean n;
   private float o;
   private float p;
   private float q;
   public static final float a = 0.083333336F;

   public void a(dbm $$0, bsh $$1, boolean $$2, boolean $$3, float $$4) {
      this.c = true;
      this.d = $$0;
      this.e = $$1;
      this.n = $$2;
      this.q = $$4;
      this.a($$1.i($$4), $$1.h($$4));
      this.b(ayg.d((double)$$4, $$1.L, $$1.dw()), ayg.d((double)$$4, $$1.M, $$1.dy()) + (double)ayg.i($$4, this.p, this.o), ayg.d((double)$$4, $$1.N, $$1.dC()));
      if ($$2) {
         if ($$3) {
            this.a(this.l + 180.0F, -this.k);
         }

         float $$6 = $$1 instanceof btc $$5 ? $$5.ed() : 1.0F;
         this.a(-this.a((double)(4.0F * $$6)), 0.0, 0.0);
      } else if ($$1 instanceof btc && ((btc)$$1).fJ()) {
         jf $$7 = ((btc)$$1).fL();
         this.a($$7 != null ? $$7.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0, 0.3, 0.0);
      }
   }

   public void a() {
      if (this.e != null) {
         this.p = this.o;
         this.o = this.o + (this.e.cN() - this.o) * 0.5F;
      }
   }

   private double a(double $$0) {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         float $$2 = (float)(($$1 & 1) * 2 - 1);
         float $$3 = (float)(($$1 >> 1 & 1) * 2 - 1);
         float $$4 = (float)(($$1 >> 2 & 1) * 2 - 1);
         $$2 *= 0.1F;
         $$3 *= 0.1F;
         $$4 *= 0.1F;
         ewh $$5 = this.f.b((double)$$2, (double)$$3, (double)$$4);
         ewh $$6 = new ewh(
            this.f.c - (double)this.h.x() * $$0 + (double)$$2,
            this.f.d - (double)this.h.y() * $$0 + (double)$$3,
            this.f.e - (double)this.h.z() * $$0 + (double)$$4
         );
         ewf $$7 = this.d.a(new dbp($$5, $$6, dbp.a.c, dbp.b.a, this.e));
         if ($$7.c() != ewf.a.a) {
            double $$8 = $$7.e().f(this.f);
            if ($$8 < $$0) {
               $$0 = $$8;
            }
         }
      }

      return $$0;
   }

   protected void a(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.h.x() * $$0 + (double)this.i.x() * $$1 + (double)this.j.x() * $$2;
      double $$4 = (double)this.h.y() * $$0 + (double)this.i.y() * $$1 + (double)this.j.y() * $$2;
      double $$5 = (double)this.h.z() * $$0 + (double)this.i.z() * $$1 + (double)this.j.z() * $$2;
      this.a(new ewh(this.f.c + $$3, this.f.d + $$4, this.f.e + $$5));
   }

   protected void a(float $$0, float $$1) {
      this.k = $$1;
      this.l = $$0;
      this.m.rotationYXZ(-$$0 * (float) (Math.PI / 180.0), $$1 * (float) (Math.PI / 180.0), 0.0F);
      this.h.set(0.0F, 0.0F, 1.0F).rotate(this.m);
      this.i.set(0.0F, 1.0F, 0.0F).rotate(this.m);
      this.j.set(1.0F, 0.0F, 0.0F).rotate(this.m);
   }

   protected void b(double $$0, double $$1, double $$2) {
      this.a(new ewh($$0, $$1, $$2));
   }

   protected void a(ewh $$0) {
      this.f = $$0;
      this.g.b($$0.c, $$0.d, $$0.e);
   }

   public ewh b() {
      return this.f;
   }

   public ja c() {
      return this.g;
   }

   public float d() {
      return this.k;
   }

   public float e() {
      return this.l;
   }

   public Quaternionf f() {
      return this.m;
   }

   public bsh g() {
      return this.e;
   }

   public boolean h() {
      return this.c;
   }

   public boolean i() {
      return this.n;
   }

   public ffg.a j() {
      ffw $$0 = ffw.Q();
      double $$1 = (double)$$0.aM().k() / (double)$$0.aM().l();
      double $$2 = Math.tan((double)((float)$$0.m.ah().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      ewh $$4 = new ewh(this.h).a(0.05F);
      ewh $$5 = new ewh(this.j).a($$3);
      ewh $$6 = new ewh(this.i).a($$2);
      return new ffg.a($$4, $$5, $$6);
   }

   public eol k() {
      if (!this.c) {
         return eol.d;
      } else {
         eoj $$0 = this.d.b_(this.g);
         if ($$0.a(awc.a) && this.f.d < (double)((float)this.g.v() + $$0.a(this.d, this.g))) {
            return eol.b;
         } else {
            ffg.a $$1 = this.j();

            for (ewh $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               ewh $$4 = this.f.e($$3);
               ja $$5 = ja.a($$4);
               eoj $$6 = this.d.b_($$5);
               if ($$6.a(awc.b)) {
                  if ($$4.d <= (double)($$6.a(this.d, $$5) + (float)$$5.v())) {
                     return eol.a;
                  }
               } else {
                  dsl $$7 = this.d.a_($$5);
                  if ($$7.a(dfk.qP)) {
                     return eol.c;
                  }
               }
            }

            return eol.d;
         }
      }
   }

   public final Vector3f l() {
      return this.h;
   }

   public final Vector3f m() {
      return this.i;
   }

   public final Vector3f n() {
      return this.j;
   }

   public void o() {
      this.d = null;
      this.e = null;
      this.c = false;
   }

   public float p() {
      return this.q;
   }

   public static class a {
      final ewh a;
      private final ewh b;
      private final ewh c;

      a(ewh $$0, ewh $$1, ewh $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ewh a() {
         return this.a.e(this.c).e(this.b);
      }

      public ewh b() {
         return this.a.e(this.c).d(this.b);
      }

      public ewh c() {
         return this.a.d(this.c).e(this.b);
      }

      public ewh d() {
         return this.a.d(this.c).d(this.b);
      }

      public ewh a(float $$0, float $$1) {
         return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
      }
   }
}
