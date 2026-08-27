import java.util.EnumSet;
import org.joml.Vector3f;

public class cbt extends blm implements cbr {
   private static final afz<Boolean> b = agc.a(cbt.class, agb.k);
   private int c = 1;

   public cbt(blj<? extends cbt> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cbt.b(this);
   }

   @Override
   protected void B() {
      this.bO.a(5, new cbt.d(this));
      this.bO.a(7, new cbt.a(this));
      this.bO.a(7, new cbt.c(this));
      this.bP.a(1, new buk<>(this, cer.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
   }

   @Override
   public boolean u() {
      return this.an.b(b);
   }

   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int w() {
      return this.c;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean h(bkd $$0) {
      return $$0.c() instanceof cfh && $$0.d() instanceof cer;
   }

   @Override
   public boolean b(bkd $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   public static bna.a A() {
      return blx.C().a(bnb.l, 10.0).a(bnb.g, 100.0);
   }

   @Override
   public ard db() {
      return ard.f;
   }

   @Override
   protected arb y() {
      return arc.jG;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.jI;
   }

   @Override
   protected arb n_() {
      return arc.jH;
   }

   @Override
   protected float eW() {
      return 5.0F;
   }

   public static boolean b(blj<cbt> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.aj() != bji.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fI() {
      return 1;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(blf $$0) {
      return 0.5F;
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 2.6F;
   }

   static class a extends bsr {
      private final cbt a;

      public a(cbt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsr.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.q() == null) {
            elb $$0 = this.a.dp();
            this.a.r(-((float)aty.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dC();
         } else {
            blv $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dr() - this.a.dr();
               double $$4 = $$1.dx() - this.a.dx();
               this.a.r(-((float)aty.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dC();
            }
         }
      }
   }

   static class b extends bru {
      private final cbt l;
      private int m;

      public b(cbt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bru.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.eg().a(5) + 2;
               elb $$0 = new elb(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, aty.c($$1))) {
                  this.l.g(this.l.dp().e($$0.a(0.1)));
               } else {
                  this.k = bru.a.a;
               }
            }
         }
      }

      private boolean a(elb $$0, int $$1) {
         ekw $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dM().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bsr {
      private final cbt b;
      public int a;

      public c(cbt $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.q() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public void d() {
         this.b.w(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         blv $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.E($$0)) {
               csy $$2 = this.b.dM();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dm(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  elb $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dr() - (this.b.dr() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dx() - (this.b.dx() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dm(), 0);
                  }

                  cfh $$8 = new cfh($$2, this.b, $$5, $$6, $$7, this.b.w());
                  $$8.a_(this.b.dr() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dx() + $$4.e * 4.0);
                  $$2.b($$8);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends bsr {
      private final cbt a;

      public d(cbt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         bru $$0 = this.a.K();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dr();
            double $$2 = $$0.e() - this.a.dt();
            double $$3 = $$0.f() - this.a.dx();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         auf $$0 = this.a.eg();
         double $$1 = this.a.dr() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dt() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dx() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.K().a($$1, $$2, $$3, 1.0);
      }
   }
}
