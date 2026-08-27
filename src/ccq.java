import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccq extends bmb implements ccg {
   public static final float b = 7.448451F;
   public static final int c = aun.f(24.166098F);
   private static final agm<Integer> d = agp.a(ccq.class, ago.b);
   els e = els.b;
   hx bS = hx.b;
   ccq.a bT = ccq.a.a;

   public ccq(bly<? extends ccq> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new ccq.g(this);
      this.bK = new ccq.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected bse H() {
      return new ccq.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new ccq.c());
      this.bO.a(2, new ccq.i());
      this.bO.a(3, new ccq.e());
      this.bP.a(1, new ccq.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, aun.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.a(bnq.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
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
         float $$0 = aun.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aun.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arr.sA, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = aun.b(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = aun.a(this.dC() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
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
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
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
   public ars db() {
      return ars.f;
   }

   @Override
   protected arq y() {
      return arr.sx;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.sB;
   }

   @Override
   protected arq n_() {
      return arr.sz;
   }

   @Override
   public bmp eS() {
      return bmp.b;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(bly<?> $$0) {
      return true;
   }

   @Override
   public blv a(bmw $$0) {
      int $$1 = this.u();
      blv $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(blu $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends btg {
      private final bwy b = bwy.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cfh> $$0 = ccq.this.dM().a(this.b, ccq.this, ccq.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(blu::dt).reversed());

               for (cfh $$1 : $$0) {
                  if (ccq.this.a($$1, bwy.a)) {
                     ccq.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bmk $$0 = ccq.this.q();
         return $$0 != null ? ccq.this.a($$0, bwy.a) : false;
      }
   }

   class c extends btg {
      private int b;

      @Override
      public boolean a() {
         bmk $$0 = ccq.this.q();
         return $$0 != null ? ccq.this.a($$0, bwy.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ccq.this.bT = ccq.a.a;
         this.h();
      }

      @Override
      public void d() {
         ccq.this.bS = ccq.this.dM().a(dop.a.e, ccq.this.bS).b(10 + ccq.this.ag.a(20));
      }

      @Override
      public void e() {
         if (ccq.this.bT == ccq.a.a) {
            this.b--;
            if (this.b <= 0) {
               ccq.this.bT = ccq.a.b;
               this.h();
               this.b = this.a((8 + ccq.this.ag.a(4)) * 20);
               ccq.this.a(arr.sC, 10.0F, 0.95F + ccq.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         ccq.this.bS = ccq.this.q().dm().b(20 + ccq.this.ag.a(20));
         if (ccq.this.bS.v() < ccq.this.dM().A_()) {
            ccq.this.bS = new hx(ccq.this.bS.u(), ccq.this.dM().A_() + 1, ccq.this.bS.w());
         }
      }
   }

   class d extends bse {
      public d(bmm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ccq.this.aW = ccq.this.aU;
         ccq.this.aU = ccq.this.dC();
      }
   }

   class e extends ccq.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ccq.this.q() == null || ccq.this.bT == ccq.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ccq.this.ag.i() * 10.0F;
         this.e = -4.0F + ccq.this.ag.i() * 9.0F;
         this.f = ccq.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ccq.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + ccq.this.ag.i() * 9.0F;
         }

         if (ccq.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ccq.this.ag.a(this.a(450)) == 0) {
            this.c = ccq.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ccq.this.e.d < ccq.this.dt() && !ccq.this.dM().u(ccq.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ccq.this.e.d > ccq.this.dt() && !ccq.this.dM().u(ccq.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hx.b.equals(ccq.this.bS)) {
            ccq.this.bS = ccq.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ccq.this.e = els.a(ccq.this.bS).b((double)(this.d * aun.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aun.a(this.c)));
      }
   }

   class f extends bsi {
      public f(bmm $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bsj {
      private float m = 0.1F;

      public g(bmm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ccq.this.P) {
            ccq.this.r(ccq.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ccq.this.e.c - ccq.this.dr();
         double $$1 = ccq.this.e.d - ccq.this.dt();
         double $$2 = ccq.this.e.e - ccq.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ccq.this.dC();
            float $$7 = (float)aun.d($$2, $$0);
            float $$8 = aun.g(ccq.this.dC() + 90.0F);
            float $$9 = aun.g($$7 * (180.0F / (float)Math.PI));
            ccq.this.r(aun.e($$8, $$9, 4.0F) - 90.0F);
            ccq.this.aU = ccq.this.dC();
            if (aun.d($$6, ccq.this.dC()) < 3.0F) {
               this.m = aun.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aun.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aun.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ccq.this.s($$10);
            float $$11 = ccq.this.dC() + 90.0F;
            double $$12 = (double)(this.m * aun.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aun.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aun.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            els $$15 = ccq.this.dp();
            ccq.this.g($$15.e(new els($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends btg {
      public h() {
         this.a(EnumSet.of(btg.a.a));
      }

      protected boolean h() {
         return ccq.this.e.c(ccq.this.dr(), ccq.this.dt(), ccq.this.dx()) < 4.0;
      }
   }

   class i extends ccq.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ccq.this.q() != null && ccq.this.bT == ccq.a.b;
      }

      @Override
      public boolean b() {
         bmk $$0 = ccq.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cfh $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ccq.this.ah > this.e) {
                  this.e = ccq.this.ah + 20;
                  List<bya> $$2 = ccq.this.dM().a(bya.class, ccq.this.cH().g(16.0), blx.a);

                  for (bya $$3 : $$2) {
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
         ccq.this.h(null);
         ccq.this.bT = ccq.a.a;
      }

      @Override
      public void e() {
         bmk $$0 = ccq.this.q();
         if ($$0 != null) {
            ccq.this.e = new els($$0.dr(), $$0.e(0.5), $$0.dx());
            if (ccq.this.cH().g(0.2F).c($$0.cH())) {
               ccq.this.C($$0);
               ccq.this.bT = ccq.a.a;
               if (!ccq.this.aU()) {
                  ccq.this.dM().c(1039, ccq.this.dm(), 0);
               }
            } else if (ccq.this.P || ccq.this.aK > 0) {
               ccq.this.bT = ccq.a.a;
            }
         }
      }
   }
}
