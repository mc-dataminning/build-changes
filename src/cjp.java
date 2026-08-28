import java.util.Collection;
import javax.annotation.Nullable;

public class cjp extends ckd implements bub {
   private static final ajw<Integer> b = aka.a(cjp.class, ajy.b);
   private static final ajw<Boolean> c = aka.a(cjp.class, ajy.k);
   private static final ajw<Boolean> d = aka.a(cjp.class, ajy.k);
   private int e;
   private int ca;
   private int cb = 30;
   private int cc = 3;
   private int cd;

   public cjp(bsx<? extends cjp> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bU.a(1, new cag(this));
      this.bU.a(2, new cbt(this));
      this.bU.a(3, new bzt<>(this, cfs.class, 6.0F, 1.0, 1.2));
      this.bU.a(3, new bzt<>(this, cfh.class, 6.0F, 1.0, 1.2));
      this.bU.a(4, new caw(this, 1.0, false));
      this.bU.a(5, new cbz(this, 0.8));
      this.bU.a(6, new cau(this, cmx.class, 8.0F));
      this.bU.a(6, new cbh(this));
      this.bV.a(1, new ccf<>(this, cmx.class, true));
      this.bV.a(2, new cce(this));
   }

   public static buv.a s() {
      return ckd.gq().a(buw.v, 0.25);
   }

   @Override
   public int cx() {
      return this.p() == null ? this.w(0.0F) : this.w(this.ew() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.ca += (int)($$0 * 1.5F);
      if (this.ca > this.cb - 5) {
         this.ca = this.cb - 5;
      }

      return $$3;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.cb);
      $$0.a("ExplosionRadius", (byte)this.cc);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ao.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.cb = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.cc = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gk();
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
            this.a(avp.gk, 1.0F, 0.5F);
            this.a(dxz.I);
         }

         this.ca += $$0;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.ca >= this.cb) {
            this.ca = this.cb;
            this.gn();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable btn $$0) {
      if (!($$0 instanceof che)) {
         super.h($$0);
      }
   }

   @Override
   protected avo d(brk $$0) {
      return avp.gj;
   }

   @Override
   protected avo n_() {
      return avp.gi;
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bsr $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cjp $$4 && $$4.gl()) {
         $$4.gm();
         this.a(cut.up);
      }
   }

   @Override
   public boolean D(bsr $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float H(float $$0) {
      return ayo.i($$0, (float)this.e, (float)this.ca) / (float)(this.cb - 2);
   }

   public int t() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqu $$0, btm $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(awn.be)) {
         avo $$3 = $$2.a(cut.tX) ? avp.iK : avp.iZ;
         this.dO().a($$0, this.dt(), this.dv(), this.dz(), $$3, this.de(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dO().B) {
            this.gk();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqr.a(this.dO().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gn() {
      if (!this.dO().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dO().a(this, this.dt(), this.dv(), this.dz(), (float)this.cc * $$0, dcw.a.c);
         this.go();
         this.c(bsr.c.a);
         this.aq();
      }
   }

   private void go() {
      Collection<brz> $$0 = this.et();
      if (!$$0.isEmpty()) {
         bsn $$1 = new bsn(this.dO(), this.dt(), this.dv(), this.dz());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (brz $$2 : $$0) {
            $$1.a(new brz($$2));
         }

         this.dO().b($$1);
      }
   }

   public boolean x() {
      return this.ao.a(d);
   }

   public void gk() {
      this.ao.a(d, true);
   }

   public boolean gl() {
      return this.a() && this.cd < 1;
   }

   public void gm() {
      this.cd++;
   }
}
