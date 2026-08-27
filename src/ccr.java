import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccr extends bmc implements cch {
   public static final float b = 7.448451F;
   public static final int c = auo.f(24.166098F);
   private static final agm<Integer> d = agp.a(ccr.class, ago.b);
   elt e = elt.b;
   hx bS = hx.b;
   ccr.a bT = ccr.a.a;

   public ccr(blz<? extends ccr> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new ccr.g(this);
      this.bK = new ccr.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected bsf H() {
      return new ccr.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new ccr.c());
      this.bO.a(2, new ccr.i());
      this.bO.a(3, new ccr.e());
      this.bP.a(1, new ccr.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, auo.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.a(bnr.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(agm<?> $$0) {
      if (d.equals($$0)) {
         this.A();
      }

      super.a($$0);
   }

   public int w() {
      return this.aj() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         float $$0 = auo.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = auo.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.sA, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = auo.b(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = auo.a(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dM().a(jx.W, this.dr() + (double)$$3, this.dt() + (double)$$5, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
         this.dM().a(jx.W, this.dr() - (double)$$3, this.dt() + (double)$$5, this.dx() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bx() && this.fY()) {
         this.g(8);
      }

      super.d_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      this.bS = this.dm().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new hx($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.u());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public art db() {
      return art.f;
   }

   @Override
   protected arr y() {
      return ars.sx;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.sB;
   }

   @Override
   protected arr n_() {
      return ars.sz;
   }

   @Override
   public bmq eS() {
      return bmq.b;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(blz<?> $$0) {
      return true;
   }

   @Override
   public blw a(bmx $$0) {
      int $$1 = this.u();
      blw $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(blv $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bth {
      private final bwz b = bwz.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cfi> $$0 = ccr.this.dM().a(this.b, ccr.this, ccr.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(blv::dt).reversed());

               for (cfi $$1 : $$0) {
                  if (ccr.this.a($$1, bwz.a)) {
                     ccr.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bml $$0 = ccr.this.q();
         return $$0 != null ? ccr.this.a($$0, bwz.a) : false;
      }
   }

   class c extends bth {
      private int b;

      @Override
      public boolean a() {
         bml $$0 = ccr.this.q();
         return $$0 != null ? ccr.this.a($$0, bwz.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ccr.this.bT = ccr.a.a;
         this.h();
      }

      @Override
      public void d() {
         ccr.this.bS = ccr.this.dM().a(doq.a.e, ccr.this.bS).b(10 + ccr.this.ag.a(20));
      }

      @Override
      public void e() {
         if (ccr.this.bT == ccr.a.a) {
            this.b--;
            if (this.b <= 0) {
               ccr.this.bT = ccr.a.b;
               this.h();
               this.b = this.a((8 + ccr.this.ag.a(4)) * 20);
               ccr.this.a(ars.sC, 10.0F, 0.95F + ccr.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         ccr.this.bS = ccr.this.q().dm().b(20 + ccr.this.ag.a(20));
         if (ccr.this.bS.v() < ccr.this.dM().A_()) {
            ccr.this.bS = new hx(ccr.this.bS.u(), ccr.this.dM().A_() + 1, ccr.this.bS.w());
         }
      }
   }

   class d extends bsf {
      public d(bmn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ccr.this.aW = ccr.this.aU;
         ccr.this.aU = ccr.this.dC();
      }
   }

   class e extends ccr.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ccr.this.q() == null || ccr.this.bT == ccr.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ccr.this.ag.i() * 10.0F;
         this.e = -4.0F + ccr.this.ag.i() * 9.0F;
         this.f = ccr.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ccr.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + ccr.this.ag.i() * 9.0F;
         }

         if (ccr.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ccr.this.ag.a(this.a(450)) == 0) {
            this.c = ccr.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ccr.this.e.d < ccr.this.dt() && !ccr.this.dM().u(ccr.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ccr.this.e.d > ccr.this.dt() && !ccr.this.dM().u(ccr.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hx.b.equals(ccr.this.bS)) {
            ccr.this.bS = ccr.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ccr.this.e = elt.a(ccr.this.bS).b((double)(this.d * auo.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * auo.a(this.c)));
      }
   }

   class f extends bsj {
      public f(bmn $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bsk {
      private float m = 0.1F;

      public g(bmn $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ccr.this.P) {
            ccr.this.r(ccr.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ccr.this.e.c - ccr.this.dr();
         double $$1 = ccr.this.e.d - ccr.this.dt();
         double $$2 = ccr.this.e.e - ccr.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ccr.this.dC();
            float $$7 = (float)auo.d($$2, $$0);
            float $$8 = auo.g(ccr.this.dC() + 90.0F);
            float $$9 = auo.g($$7 * (180.0F / (float)Math.PI));
            ccr.this.r(auo.e($$8, $$9, 4.0F) - 90.0F);
            ccr.this.aU = ccr.this.dC();
            if (auo.d($$6, ccr.this.dC()) < 3.0F) {
               this.m = auo.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = auo.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(auo.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ccr.this.s($$10);
            float $$11 = ccr.this.dC() + 90.0F;
            double $$12 = (double)(this.m * auo.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * auo.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * auo.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            elt $$15 = ccr.this.dp();
            ccr.this.g($$15.e(new elt($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bth {
      public h() {
         this.a(EnumSet.of(bth.a.a));
      }

      protected boolean h() {
         return ccr.this.e.c(ccr.this.dr(), ccr.this.dt(), ccr.this.dx()) < 4.0;
      }
   }

   class i extends ccr.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ccr.this.q() != null && ccr.this.bT == ccr.a.b;
      }

      @Override
      public boolean b() {
         bml $$0 = ccr.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cfi $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ccr.this.ah > this.e) {
                  this.e = ccr.this.ah + 20;
                  List<byb> $$2 = ccr.this.dM().a(byb.class, ccr.this.cH().g(16.0), bly.a);

                  for (byb $$3 : $$2) {
                     $$3.gp();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
         ccr.this.h(null);
         ccr.this.bT = ccr.a.a;
      }

      @Override
      public void e() {
         bml $$0 = ccr.this.q();
         if ($$0 != null) {
            ccr.this.e = new elt($$0.dr(), $$0.e(0.5), $$0.dx());
            if (ccr.this.cH().g(0.2F).c($$0.cH())) {
               ccr.this.C($$0);
               ccr.this.bT = ccr.a.a;
               if (!ccr.this.aU()) {
                  ccr.this.dM().c(1039, ccr.this.dm(), 0);
               }
            } else if (ccr.this.P || ccr.this.aK > 0) {
               ccr.this.bT = ccr.a.a;
            }
         }
      }
   }
}
