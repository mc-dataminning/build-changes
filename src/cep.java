import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cep extends bnx implements cef {
   public static final float b = 7.448451F;
   public static final int c = awh.f(24.166098F);
   private static final aie<Integer> d = aih.a(cep.class, aig.b);
   ens e = ens.b;
   hz bS = hz.c;
   cep.a bT = cep.a.a;

   public cep(bnu<? extends cep> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cep.g(this);
      this.bK = new cep.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ag) % c == 0;
   }

   @Override
   protected btz H() {
      return new cep.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cep.c());
      this.bO.a(2, new cep.i());
      this.bO.a(3, new cep.e());
      this.bP.a(1, new cep.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0);
   }

   public void b(int $$0) {
      this.am.b(d, awh.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.f(bpl.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.am.b(d);
   }

   @Override
   public void a(aie<?> $$0) {
      if (d.equals($$0)) {
         this.A();
      }

      super.a($$0);
   }

   public int w() {
      return this.aj() * 3;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         float $$0 = awh.b((float)(this.w() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = awh.b((float)(this.w() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atk.sP, this.db(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dg() * 1.48F;
         float $$3 = awh.b(this.dC() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = awh.a(this.dC() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dh() * 2.5F;
         this.dM().a(jz.W, this.dr() + (double)$$3, this.dt() + (double)$$5, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
         this.dM().a(jz.W, this.dr() - (double)$$3, this.dt() + (double)$$5, this.dx() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bx() && this.ga()) {
         this.g(8);
      }

      super.d_();
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.bS = this.dm().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new hz($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sw $$0) {
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
   public atl db() {
      return atl.f;
   }

   @Override
   protected atj y() {
      return atk.sM;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.sQ;
   }

   @Override
   protected atj n_() {
      return atk.sO;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(bnu<?> $$0) {
      return true;
   }

   @Override
   public bnr e(bor $$0) {
      int $$1 = this.u();
      bnr $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bvb {
      private final byu b = byu.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<chh> $$0 = cep.this.dM().a(this.b, cep.this, cep.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bno::dt).reversed());

               for (chh $$1 : $$0) {
                  if (cep.this.a($$1, byu.a)) {
                     cep.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bog $$0 = cep.this.q();
         return $$0 != null ? cep.this.a($$0, byu.a) : false;
      }
   }

   class c extends bvb {
      private int b;

      @Override
      public boolean a() {
         bog $$0 = cep.this.q();
         return $$0 != null ? cep.this.a($$0, byu.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cep.this.bT = cep.a.a;
         this.h();
      }

      @Override
      public void d() {
         cep.this.bS = cep.this.dM().a(dqo.a.e, cep.this.bS).b(10 + cep.this.af.a(20));
      }

      @Override
      public void e() {
         if (cep.this.bT == cep.a.a) {
            this.b--;
            if (this.b <= 0) {
               cep.this.bT = cep.a.b;
               this.h();
               this.b = this.a((8 + cep.this.af.a(4)) * 20);
               cep.this.a(atk.sR, 10.0F, 0.95F + cep.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         cep.this.bS = cep.this.q().dm().b(20 + cep.this.af.a(20));
         if (cep.this.bS.v() < cep.this.dM().A_()) {
            cep.this.bS = new hz(cep.this.bS.u(), cep.this.dM().A_() + 1, cep.this.bS.w());
         }
      }
   }

   class d extends btz {
      public d(boi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cep.this.aW = cep.this.aU;
         cep.this.aU = cep.this.dC();
      }
   }

   class e extends cep.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cep.this.q() == null || cep.this.bT == cep.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cep.this.af.i() * 10.0F;
         this.e = -4.0F + cep.this.af.i() * 9.0F;
         this.f = cep.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cep.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + cep.this.af.i() * 9.0F;
         }

         if (cep.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cep.this.af.a(this.a(450)) == 0) {
            this.c = cep.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cep.this.e.d < cep.this.dt() && !cep.this.dM().u(cep.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cep.this.e.d > cep.this.dt() && !cep.this.dM().u(cep.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hz.c.equals(cep.this.bS)) {
            cep.this.bS = cep.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cep.this.e = ens.a(cep.this.bS).b((double)(this.d * awh.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * awh.a(this.c)));
      }
   }

   class f extends bud {
      public f(boi $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bue {
      private float m = 0.1F;

      public g(boi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cep.this.O) {
            cep.this.r(cep.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cep.this.e.c - cep.this.dr();
         double $$1 = cep.this.e.d - cep.this.dt();
         double $$2 = cep.this.e.e - cep.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cep.this.dC();
            float $$7 = (float)awh.d($$2, $$0);
            float $$8 = awh.g(cep.this.dC() + 90.0F);
            float $$9 = awh.g($$7 * (180.0F / (float)Math.PI));
            cep.this.r(awh.e($$8, $$9, 4.0F) - 90.0F);
            cep.this.aU = cep.this.dC();
            if (awh.d($$6, cep.this.dC()) < 3.0F) {
               this.m = awh.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = awh.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(awh.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cep.this.s($$10);
            float $$11 = cep.this.dC() + 90.0F;
            double $$12 = (double)(this.m * awh.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * awh.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * awh.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ens $$15 = cep.this.dp();
            cep.this.g($$15.e(new ens($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bvb {
      public h() {
         this.a(EnumSet.of(bvb.a.a));
      }

      protected boolean h() {
         return cep.this.e.c(cep.this.dr(), cep.this.dt(), cep.this.dx()) < 4.0;
      }
   }

   class i extends cep.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cep.this.q() != null && cep.this.bT == cep.a.b;
      }

      @Override
      public boolean b() {
         bog $$0 = cep.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof chh $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cep.this.ag > this.e) {
                  this.e = cep.this.ag + 20;
                  List<bzw> $$2 = cep.this.dM().a(bzw.class, cep.this.cH().g(16.0), bnt.a);

                  for (bzw $$3 : $$2) {
                     $$3.gr();
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
         cep.this.h(null);
         cep.this.bT = cep.a.a;
      }

      @Override
      public void e() {
         bog $$0 = cep.this.q();
         if ($$0 != null) {
            cep.this.e = new ens($$0.dr(), $$0.e(0.5), $$0.dx());
            if (cep.this.cH().g(0.2F).c($$0.cH())) {
               cep.this.B($$0);
               cep.this.bT = cep.a.a;
               if (!cep.this.aU()) {
                  cep.this.dM().c(1039, cep.this.dm(), 0);
               }
            } else if (cep.this.O || cep.this.aK > 0) {
               cep.this.bT = cep.a.a;
            }
         }
      }
   }
}
