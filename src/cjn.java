import java.util.Collection;
import javax.annotation.Nullable;

public class cjn extends ckb implements btz {
   private static final ajv<Integer> b = ajz.a(cjn.class, ajx.b);
   private static final ajv<Boolean> c = ajz.a(cjn.class, ajx.k);
   private static final ajv<Boolean> d = ajz.a(cjn.class, ajx.k);
   private int e;
   private int ca;
   private int cb = 30;
   private int cc = 3;
   private int cd;

   public cjn(bsw<? extends cjn> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cae(this));
      this.bU.a(2, new cbr(this));
      this.bU.a(3, new bzr<>(this, cfq.class, 6.0F, 1.0, 1.2));
      this.bU.a(3, new bzr<>(this, cff.class, 6.0F, 1.0, 1.2));
      this.bU.a(4, new cau(this, 1.0, false));
      this.bU.a(5, new cbx(this, 0.8));
      this.bU.a(6, new cas(this, cmv.class, 8.0F));
      this.bU.a(6, new cbf(this));
      this.bV.a(1, new ccd<>(this, cmv.class, true));
      this.bV.a(2, new ccc(this));
   }

   public static but.a s() {
      return ckb.gs().a(buu.v, 0.25);
   }

   @Override
   public int cy() {
      return this.p() == null ? this.v(0.0F) : this.v(this.ex() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.ca += (int)($$0 * 1.5F);
      if (this.ca > this.cb - 5) {
         this.ca = this.cb - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.cb);
      $$0.a("ExplosionRadius", (byte)this.cc);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.ao.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.cb = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.cc = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gm();
      }
   }

   @Override
   public void l() {
      if (this.bE()) {
         this.e = this.ca;
         if (this.x()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.ca == 0) {
            this.a(avo.gk, 1.0F, 0.5F);
            this.a(dxw.I);
         }

         this.ca += $$0;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.ca >= this.cb) {
            this.ca = this.cb;
            this.gp();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable btl $$0) {
      if (!($$0 instanceof chc)) {
         super.h($$0);
      }
   }

   @Override
   protected avn d(brj $$0) {
      return avo.gj;
   }

   @Override
   protected avn n_() {
      return avo.gi;
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bsq $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cjn $$4 && $$4.gn()) {
         $$4.go();
         this.a(cur.up);
      }
   }

   @Override
   public boolean D(bsq $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float H(float $$0) {
      return ayn.i($$0, (float)this.e, (float)this.ca) / (float)(this.cb - 2);
   }

   public int t() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqt $$0, btk $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(awm.be)) {
         avn $$3 = $$2.a(cur.tX) ? avo.iK : avo.iZ;
         this.dQ().a($$0, this.dv(), this.dx(), this.dB(), $$3, this.df(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dQ().B) {
            this.gm();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqq.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gp() {
      if (!this.dQ().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dQ().a(this, this.dv(), this.dx(), this.dB(), (float)this.cc * $$0, dcu.a.c);
         this.gq();
         this.c(bsq.c.a);
         this.aq();
      }
   }

   private void gq() {
      Collection<bry> $$0 = this.eu();
      if (!$$0.isEmpty()) {
         bsm $$1 = new bsm(this.dQ(), this.dv(), this.dx(), this.dB());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bry $$2 : $$0) {
            $$1.a(new bry($$2));
         }

         this.dQ().b($$1);
      }
   }

   public boolean x() {
      return this.ao.a(d);
   }

   public void gm() {
      this.ao.a(d, true);
   }

   public boolean gn() {
      return this.a() && this.cd < 1;
   }

   public void go() {
      this.cd++;
   }
}
