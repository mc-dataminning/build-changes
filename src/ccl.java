import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccl extends blw implements ccb {
   public static final float b = 7.448451F;
   public static final int c = aui.f(24.166098F);
   private static final agj<Integer> d = agm.a(ccl.class, agl.b);
   elm e = elm.b;
   hx bS = hx.b;
   ccl.a bT = ccl.a.a;

   public ccl(blt<? extends ccl> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new ccl.g(this);
      this.bK = new ccl.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected brz H() {
      return new ccl.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new ccl.c());
      this.bO.a(2, new ccl.i());
      this.bO.a(3, new ccl.e());
      this.bP.a(1, new ccl.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, aui.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.a(bnl.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(agj<?> $$0) {
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
         float $$0 = aui.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aui.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arm.sA, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = aui.b(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = aui.a(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
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
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.bS = this.dm().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new hx($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sl $$0) {
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
   public arn db() {
      return arn.f;
   }

   @Override
   protected arl y() {
      return arm.sx;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.sB;
   }

   @Override
   protected arl n_() {
      return arm.sz;
   }

   @Override
   public bmk eS() {
      return bmk.b;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(blt<?> $$0) {
      return true;
   }

   @Override
   public blq a(bmr $$0) {
      int $$1 = this.u();
      blq $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(blp $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends btb {
      private final bwt b = bwt.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cfb> $$0 = ccl.this.dM().a(this.b, ccl.this, ccl.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(blp::dt).reversed());

               for (cfb $$1 : $$0) {
                  if (ccl.this.a($$1, bwt.a)) {
                     ccl.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bmf $$0 = ccl.this.q();
         return $$0 != null ? ccl.this.a($$0, bwt.a) : false;
      }
   }

   class c extends btb {
      private int b;

      @Override
      public boolean a() {
         bmf $$0 = ccl.this.q();
         return $$0 != null ? ccl.this.a($$0, bwt.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ccl.this.bT = ccl.a.a;
         this.h();
      }

      @Override
      public void d() {
         ccl.this.bS = ccl.this.dM().a(doj.a.e, ccl.this.bS).b(10 + ccl.this.ag.a(20));
      }

      @Override
      public void e() {
         if (ccl.this.bT == ccl.a.a) {
            this.b--;
            if (this.b <= 0) {
               ccl.this.bT = ccl.a.b;
               this.h();
               this.b = this.a((8 + ccl.this.ag.a(4)) * 20);
               ccl.this.a(arm.sC, 10.0F, 0.95F + ccl.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         ccl.this.bS = ccl.this.q().dm().b(20 + ccl.this.ag.a(20));
         if (ccl.this.bS.v() < ccl.this.dM().A_()) {
            ccl.this.bS = new hx(ccl.this.bS.u(), ccl.this.dM().A_() + 1, ccl.this.bS.w());
         }
      }
   }

   class d extends brz {
      public d(bmh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ccl.this.aW = ccl.this.aU;
         ccl.this.aU = ccl.this.dC();
      }
   }

   class e extends ccl.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ccl.this.q() == null || ccl.this.bT == ccl.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ccl.this.ag.i() * 10.0F;
         this.e = -4.0F + ccl.this.ag.i() * 9.0F;
         this.f = ccl.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ccl.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + ccl.this.ag.i() * 9.0F;
         }

         if (ccl.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ccl.this.ag.a(this.a(450)) == 0) {
            this.c = ccl.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ccl.this.e.d < ccl.this.dt() && !ccl.this.dM().u(ccl.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ccl.this.e.d > ccl.this.dt() && !ccl.this.dM().u(ccl.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hx.b.equals(ccl.this.bS)) {
            ccl.this.bS = ccl.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ccl.this.e = elm.a(ccl.this.bS).b((double)(this.d * aui.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aui.a(this.c)));
      }
   }

   class f extends bsd {
      public f(bmh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bse {
      private float m = 0.1F;

      public g(bmh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ccl.this.P) {
            ccl.this.r(ccl.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ccl.this.e.c - ccl.this.dr();
         double $$1 = ccl.this.e.d - ccl.this.dt();
         double $$2 = ccl.this.e.e - ccl.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ccl.this.dC();
            float $$7 = (float)aui.d($$2, $$0);
            float $$8 = aui.g(ccl.this.dC() + 90.0F);
            float $$9 = aui.g($$7 * (180.0F / (float)Math.PI));
            ccl.this.r(aui.e($$8, $$9, 4.0F) - 90.0F);
            ccl.this.aU = ccl.this.dC();
            if (aui.d($$6, ccl.this.dC()) < 3.0F) {
               this.m = aui.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aui.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aui.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ccl.this.s($$10);
            float $$11 = ccl.this.dC() + 90.0F;
            double $$12 = (double)(this.m * aui.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aui.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aui.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            elm $$15 = ccl.this.dp();
            ccl.this.g($$15.e(new elm($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends btb {
      public h() {
         this.a(EnumSet.of(btb.a.a));
      }

      protected boolean h() {
         return ccl.this.e.c(ccl.this.dr(), ccl.this.dt(), ccl.this.dx()) < 4.0;
      }
   }

   class i extends ccl.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ccl.this.q() != null && ccl.this.bT == ccl.a.b;
      }

      @Override
      public boolean b() {
         bmf $$0 = ccl.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cfb $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ccl.this.ah > this.e) {
                  this.e = ccl.this.ah + 20;
                  List<bxv> $$2 = ccl.this.dM().a(bxv.class, ccl.this.cH().g(16.0), bls.a);

                  for (bxv $$3 : $$2) {
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
         ccl.this.h(null);
         ccl.this.bT = ccl.a.a;
      }

      @Override
      public void e() {
         bmf $$0 = ccl.this.q();
         if ($$0 != null) {
            ccl.this.e = new elm($$0.dr(), $$0.e(0.5), $$0.dx());
            if (ccl.this.cH().g(0.2F).c($$0.cH())) {
               ccl.this.C($$0);
               ccl.this.bT = ccl.a.a;
               if (!ccl.this.aU()) {
                  ccl.this.dM().c(1039, ccl.this.dm(), 0);
               }
            } else if (ccl.this.P || ccl.this.aK > 0) {
               ccl.this.bT = ccl.a.a;
            }
         }
      }
   }
}
