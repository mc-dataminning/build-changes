import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccb extends blm implements cbr {
   public static final float b = 7.448451F;
   public static final int c = aty.f(24.166098F);
   private static final afz<Integer> d = agc.a(ccb.class, agb.b);
   elb e = elb.b;
   hv bS = hv.b;
   ccb.a bT = ccb.a.a;

   public ccb(blj<? extends ccb> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new ccb.g(this);
      this.bK = new ccb.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected brp H() {
      return new ccb.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new ccb.c());
      this.bO.a(2, new ccb.i());
      this.bO.a(3, new ccb.e());
      this.bP.a(1, new ccb.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, aty.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.a(bnb.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(afz<?> $$0) {
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
         float $$0 = aty.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aty.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.sA, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = aty.b(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = aty.a(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dM().a(jv.W, this.dr() + (double)$$3, this.dt() + (double)$$5, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
         this.dM().a(jv.W, this.dr() - (double)$$3, this.dt() + (double)$$5, this.dx() - (double)$$4, 0.0, 0.0, 0.0);
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
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.bS = this.dm().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new hv($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sj $$0) {
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
   public ard db() {
      return ard.f;
   }

   @Override
   protected arb y() {
      return arc.sx;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.sB;
   }

   @Override
   protected arb n_() {
      return arc.sz;
   }

   @Override
   public bma eS() {
      return bma.b;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(blj<?> $$0) {
      return true;
   }

   @Override
   public blg a(bmh $$0) {
      int $$1 = this.u();
      blg $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(blf $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bsr {
      private final bwj b = bwj.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cer> $$0 = ccb.this.dM().a(this.b, ccb.this, ccb.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(blf::dt).reversed());

               for (cer $$1 : $$0) {
                  if (ccb.this.a($$1, bwj.a)) {
                     ccb.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         blv $$0 = ccb.this.q();
         return $$0 != null ? ccb.this.a($$0, bwj.a) : false;
      }
   }

   class c extends bsr {
      private int b;

      @Override
      public boolean a() {
         blv $$0 = ccb.this.q();
         return $$0 != null ? ccb.this.a($$0, bwj.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ccb.this.bT = ccb.a.a;
         this.h();
      }

      @Override
      public void d() {
         ccb.this.bS = ccb.this.dM().a(dny.a.e, ccb.this.bS).b(10 + ccb.this.ag.a(20));
      }

      @Override
      public void e() {
         if (ccb.this.bT == ccb.a.a) {
            this.b--;
            if (this.b <= 0) {
               ccb.this.bT = ccb.a.b;
               this.h();
               this.b = this.a((8 + ccb.this.ag.a(4)) * 20);
               ccb.this.a(arc.sC, 10.0F, 0.95F + ccb.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         ccb.this.bS = ccb.this.q().dm().b(20 + ccb.this.ag.a(20));
         if (ccb.this.bS.v() < ccb.this.dM().A_()) {
            ccb.this.bS = new hv(ccb.this.bS.u(), ccb.this.dM().A_() + 1, ccb.this.bS.w());
         }
      }
   }

   class d extends brp {
      public d(blx $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ccb.this.aW = ccb.this.aU;
         ccb.this.aU = ccb.this.dC();
      }
   }

   class e extends ccb.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ccb.this.q() == null || ccb.this.bT == ccb.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ccb.this.ag.i() * 10.0F;
         this.e = -4.0F + ccb.this.ag.i() * 9.0F;
         this.f = ccb.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ccb.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + ccb.this.ag.i() * 9.0F;
         }

         if (ccb.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ccb.this.ag.a(this.a(450)) == 0) {
            this.c = ccb.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ccb.this.e.d < ccb.this.dt() && !ccb.this.dM().t(ccb.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ccb.this.e.d > ccb.this.dt() && !ccb.this.dM().t(ccb.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hv.b.equals(ccb.this.bS)) {
            ccb.this.bS = ccb.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ccb.this.e = elb.a(ccb.this.bS).b((double)(this.d * aty.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aty.a(this.c)));
      }
   }

   class f extends brt {
      public f(blx $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bru {
      private float m = 0.1F;

      public g(blx $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ccb.this.P) {
            ccb.this.r(ccb.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ccb.this.e.c - ccb.this.dr();
         double $$1 = ccb.this.e.d - ccb.this.dt();
         double $$2 = ccb.this.e.e - ccb.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ccb.this.dC();
            float $$7 = (float)aty.d($$2, $$0);
            float $$8 = aty.g(ccb.this.dC() + 90.0F);
            float $$9 = aty.g($$7 * (180.0F / (float)Math.PI));
            ccb.this.r(aty.e($$8, $$9, 4.0F) - 90.0F);
            ccb.this.aU = ccb.this.dC();
            if (aty.d($$6, ccb.this.dC()) < 3.0F) {
               this.m = aty.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aty.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aty.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ccb.this.s($$10);
            float $$11 = ccb.this.dC() + 90.0F;
            double $$12 = (double)(this.m * aty.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aty.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aty.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            elb $$15 = ccb.this.dp();
            ccb.this.g($$15.e(new elb($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bsr {
      public h() {
         this.a(EnumSet.of(bsr.a.a));
      }

      protected boolean h() {
         return ccb.this.e.c(ccb.this.dr(), ccb.this.dt(), ccb.this.dx()) < 4.0;
      }
   }

   class i extends ccb.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ccb.this.q() != null && ccb.this.bT == ccb.a.b;
      }

      @Override
      public boolean b() {
         blv $$0 = ccb.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cer $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ccb.this.ah > this.e) {
                  this.e = ccb.this.ah + 20;
                  List<bxl> $$2 = ccb.this.dM().a(bxl.class, ccb.this.cH().g(16.0), bli.a);

                  for (bxl $$3 : $$2) {
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
         ccb.this.h(null);
         ccb.this.bT = ccb.a.a;
      }

      @Override
      public void e() {
         blv $$0 = ccb.this.q();
         if ($$0 != null) {
            ccb.this.e = new elb($$0.dr(), $$0.e(0.5), $$0.dx());
            if (ccb.this.cH().g(0.2F).c($$0.cH())) {
               ccb.this.C($$0);
               ccb.this.bT = ccb.a.a;
               if (!ccb.this.aU()) {
                  ccb.this.dM().c(1039, ccb.this.dm(), 0);
               }
            } else if (ccb.this.P || ccb.this.aK > 0) {
               ccb.this.bT = ccb.a.a;
            }
         }
      }
   }
}
