import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class ccd extends cfh implements cbr {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bmp e = new bmp(b, "Drinking speed penalty", -0.25, bmp.a.a);
   private static final afs<Boolean> bT = afv.a(ccd.class, afu.k);
   private int bU;
   private bub<cfh> bV;
   private bua<cdz> bW;

   public ccd(bkz<? extends ccd> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new bub<>(this, cfh.class, true, $$0 -> $$0 != null && this.gu() && $$0.ai() != bkz.bj);
      this.bW = new bua<>(this, cdz.class, 10, true, false, null);
      this.bO.a(1, new bsa(this));
      this.bO.a(2, new btf(this, 1.0, 60, 10.0F));
      this.bO.a(2, new btt(this, 1.0));
      this.bO.a(3, new bso(this, cdz.class, 8.0F));
      this.bO.a(3, new btb(this));
      this.bP.a(1, new bty(this, cfh.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected aqu y() {
      return aqv.AJ;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.AN;
   }

   @Override
   protected aqu n_() {
      return aqv.AL;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.l, 26.0).a(bmr.m, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dN().B && this.bx()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.u()) {
            if (this.bU-- <= 0) {
               this.y(false);
               clo $$0 = this.eU();
               this.a(bla.a, clo.b);
               if ($$0.a(clr.sh)) {
                  List<bki> $$1 = cnn.a($$0);
                  if ($$1 != null) {
                     for (bki $$2 : $$1) {
                        this.b(new bki($$2));
                     }
                  }
               }

               this.a(dlx.l);
               this.a(bmr.m).b(e.a());
            }
         } else {
            cnl $$3 = null;
            if (this.ag.i() < 0.15F && this.a(arp.a) && !this.a(bkk.m)) {
               $$3 = cno.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ey() != null && this.ey().a(arm.i)) && !this.a(bkk.l)) {
               $$3 = cno.n;
            } else if (this.ag.i() < 0.05F && this.ew() < this.eN()) {
               $$3 = cno.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bkk.a) && this.q().f(this) > 121.0) {
               $$3 = cno.p;
            }

            if ($$3 != null) {
               this.a(bla.a, cnn.a(new clo(clr.sh), $$3));
               this.bU = this.eU().r();
               this.y(true);
               if (!this.aU()) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.AM, this.dc(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bmn $$4 = this.a(bmr.m);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dN().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public aqu af_() {
      return aqv.AK;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dN().a(jw.ai, this.ds() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dy() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bjt $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(arm.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bll $$0, float $$1) {
      if (!this.u()) {
         ejz $$2 = $$0.dq();
         double $$3 = $$0.ds() + $$2.c - this.ds();
         double $$4 = $$0.dw() - 1.1F - this.du();
         double $$5 = $$0.dy() + $$2.e - this.dy();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cnl $$7 = cno.C;
         if ($$0 instanceof cfh) {
            if ($$0.ew() <= 4.0F) {
               $$7 = cno.A;
            } else {
               $$7 = cno.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bkk.b)) {
            $$7 = cno.s;
         } else if ($$0.ew() >= 8.0F && !$$0.a(bkk.s)) {
            $$7 = cno.E;
         } else if ($$6 <= 3.0 && !$$0.a(bkk.r) && this.ag.i() < 0.25F) {
            $$7 = cno.N;
         }

         cfc $$8 = new cfc(this.dN(), this);
         $$8.a(cnn.a(new clo(clr.vg), $$7));
         $$8.s($$8.dF() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.AO, this.dc(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dN().b($$8);
      }
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gg() {
      return false;
   }
}
