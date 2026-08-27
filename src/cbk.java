import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbk extends bkx implements cba {
   public static final float b = 7.448451F;
   public static final int c = atm.f(24.166098F);
   private static final afo<Integer> d = afr.a(cbk.class, afq.b);
   eju e = eju.b;
   ht bS = ht.b;
   cbk.a bT = cbk.a.a;

   public cbk(bku<? extends cbk> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cbk.g(this);
      this.bK = new cbk.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected bqz H() {
      return new cbk.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cbk.c());
      this.bO.a(2, new cbk.i());
      this.bO.a(3, new cbk.e());
      this.bP.a(1, new cbk.b());
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, atm.a($$0, 0, 64));
   }

   private void A() {
      this.j_();
      this.a(bmm.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(afo<?> $$0) {
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
      if (this.dN().B) {
         float $$0 = atm.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = atm.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.sf, this.dc(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = atm.b(this.dD() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = atm.a(this.dD() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dN().a(js.U, this.ds() + (double)$$3, this.du() + (double)$$5, this.dy() + (double)$$4, 0.0, 0.0, 0.0);
         this.dN().a(js.U, this.ds() - (double)$$3, this.du() + (double)$$5, this.dy() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c_() {
      if (this.bx() && this.fZ()) {
         this.g(8);
      }

      super.c_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.bS = this.dn().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new ht($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(rz $$0) {
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
   public aqs dc() {
      return aqs.f;
   }

   @Override
   protected aqq y() {
      return aqr.sc;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.sg;
   }

   @Override
   protected aqq m_() {
      return aqr.se;
   }

   @Override
   public bll eT() {
      return bll.b;
   }

   @Override
   protected float eX() {
      return 1.0F;
   }

   @Override
   public boolean a(bku<?> $$0) {
      return true;
   }

   @Override
   public bkr a(bls $$0) {
      int $$1 = this.u();
      bkr $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bkq $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bsb {
      private final bvs b = bvs.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cdu> $$0 = cbk.this.dN().a(this.b, cbk.this, cbk.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bkq::du).reversed());

               for (cdu $$1 : $$0) {
                  if (cbk.this.a($$1, bvs.a)) {
                     cbk.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         blg $$0 = cbk.this.q();
         return $$0 != null ? cbk.this.a($$0, bvs.a) : false;
      }
   }

   class c extends bsb {
      private int b;

      @Override
      public boolean a() {
         blg $$0 = cbk.this.q();
         return $$0 != null ? cbk.this.a($$0, bvs.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cbk.this.bT = cbk.a.a;
         this.h();
      }

      @Override
      public void d() {
         cbk.this.bS = cbk.this.dN().a(dmr.a.e, cbk.this.bS).b(10 + cbk.this.ag.a(20));
      }

      @Override
      public void e() {
         if (cbk.this.bT == cbk.a.a) {
            this.b--;
            if (this.b <= 0) {
               cbk.this.bT = cbk.a.b;
               this.h();
               this.b = this.a((8 + cbk.this.ag.a(4)) * 20);
               cbk.this.a(aqr.sh, 10.0F, 0.95F + cbk.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         cbk.this.bS = cbk.this.q().dn().b(20 + cbk.this.ag.a(20));
         if (cbk.this.bS.v() < cbk.this.dN().z_()) {
            cbk.this.bS = new ht(cbk.this.bS.u(), cbk.this.dN().z_() + 1, cbk.this.bS.w());
         }
      }
   }

   class d extends bqz {
      public d(bli $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cbk.this.aW = cbk.this.aU;
         cbk.this.aU = cbk.this.dD();
      }
   }

   class e extends cbk.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cbk.this.q() == null || cbk.this.bT == cbk.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cbk.this.ag.i() * 10.0F;
         this.e = -4.0F + cbk.this.ag.i() * 9.0F;
         this.f = cbk.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cbk.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + cbk.this.ag.i() * 9.0F;
         }

         if (cbk.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cbk.this.ag.a(this.a(450)) == 0) {
            this.c = cbk.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cbk.this.e.d < cbk.this.du() && !cbk.this.dN().t(cbk.this.dn().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cbk.this.e.d > cbk.this.du() && !cbk.this.dN().t(cbk.this.dn().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ht.b.equals(cbk.this.bS)) {
            cbk.this.bS = cbk.this.dn();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cbk.this.e = eju.a(cbk.this.bS).b((double)(this.d * atm.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * atm.a(this.c)));
      }
   }

   class f extends brd {
      public f(bli $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bre {
      private float m = 0.1F;

      public g(bli $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cbk.this.P) {
            cbk.this.r(cbk.this.dD() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cbk.this.e.c - cbk.this.ds();
         double $$1 = cbk.this.e.d - cbk.this.du();
         double $$2 = cbk.this.e.e - cbk.this.dy();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cbk.this.dD();
            float $$7 = (float)atm.d($$2, $$0);
            float $$8 = atm.g(cbk.this.dD() + 90.0F);
            float $$9 = atm.g($$7 * (180.0F / (float)Math.PI));
            cbk.this.r(atm.e($$8, $$9, 4.0F) - 90.0F);
            cbk.this.aU = cbk.this.dD();
            if (atm.d($$6, cbk.this.dD()) < 3.0F) {
               this.m = atm.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = atm.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(atm.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cbk.this.s($$10);
            float $$11 = cbk.this.dD() + 90.0F;
            double $$12 = (double)(this.m * atm.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * atm.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * atm.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eju $$15 = cbk.this.dq();
            cbk.this.g($$15.e(new eju($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bsb {
      public h() {
         this.a(EnumSet.of(bsb.a.a));
      }

      protected boolean h() {
         return cbk.this.e.c(cbk.this.ds(), cbk.this.du(), cbk.this.dy()) < 4.0;
      }
   }

   class i extends cbk.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cbk.this.q() != null && cbk.this.bT == cbk.a.b;
      }

      @Override
      public boolean b() {
         blg $$0 = cbk.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cdu $$1 && ($$0.O_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cbk.this.ah > this.e) {
                  this.e = cbk.this.ah + 20;
                  List<bwu> $$2 = cbk.this.dN().a(bwu.class, cbk.this.cH().g(16.0), bkt.a);

                  for (bwu $$3 : $$2) {
                     $$3.gq();
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
         cbk.this.h(null);
         cbk.this.bT = cbk.a.a;
      }

      @Override
      public void e() {
         blg $$0 = cbk.this.q();
         if ($$0 != null) {
            cbk.this.e = new eju($$0.ds(), $$0.e(0.5), $$0.dy());
            if (cbk.this.cH().g(0.2F).c($$0.cH())) {
               cbk.this.C($$0);
               cbk.this.bT = cbk.a.a;
               if (!cbk.this.aU()) {
                  cbk.this.dN().c(1039, cbk.this.dn(), 0);
               }
            } else if (cbk.this.P || cbk.this.aK > 0) {
               cbk.this.bT = cbk.a.a;
            }
         }
      }
   }
}
