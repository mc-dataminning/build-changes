import java.util.Collection;
import javax.annotation.Nullable;

public class cjd extends cjr implements btp {
   private static final ajp<Integer> b = ajt.a(cjd.class, ajr.b);
   private static final ajp<Boolean> c = ajt.a(cjd.class, ajr.k);
   private static final ajp<Boolean> d = ajt.a(cjd.class, ajr.k);
   private int e;
   private int ca;
   private int cb = 30;
   private int cc = 3;
   private int cd;

   public cjd(bsn<? extends cjd> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzu(this));
      this.bU.a(2, new cbh(this));
      this.bU.a(3, new bzh<>(this, cfg.class, 6.0F, 1.0, 1.2));
      this.bU.a(3, new bzh<>(this, cev.class, 6.0F, 1.0, 1.2));
      this.bU.a(4, new cak(this, 1.0, false));
      this.bU.a(5, new cbn(this, 0.8));
      this.bU.a(6, new cai(this, cml.class, 8.0F));
      this.bU.a(6, new cav(this));
      this.bV.a(1, new cbt<>(this, cml.class, true));
      this.bV.a(2, new cbs(this));
   }

   public static buj.a s() {
      return cjr.gt().a(buk.v, 0.25);
   }

   @Override
   public int cz() {
      return this.p() == null ? this.v(0.0F) : this.v(this.ey() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.ca += (int)($$0 * 1.5F);
      if (this.ca > this.cb - 5) {
         this.ca = this.cb - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.cb);
      $$0.a("ExplosionRadius", (byte)this.cc);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ao.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.cb = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.cc = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gn();
      }
   }

   @Override
   public void l() {
      if (this.bF()) {
         this.e = this.ca;
         if (this.x()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.ca == 0) {
            this.a(avh.gk, 1.0F, 0.5F);
            this.a(dxh.I);
         }

         this.ca += $$0;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.ca >= this.cb) {
            this.ca = this.cb;
            this.gq();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable btc $$0) {
      if (!($$0 instanceof cgs)) {
         super.h($$0);
      }
   }

   @Override
   protected avg d(bra $$0) {
      return avh.gj;
   }

   @Override
   protected avg n_() {
      return avh.gi;
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bsh $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cjd $$4 && $$4.go()) {
         $$4.gp();
         this.a(cug.up);
      }
   }

   @Override
   public boolean D(bsh $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float H(float $$0) {
      return ayg.i($$0, (float)this.e, (float)this.ca) / (float)(this.cb - 2);
   }

   public int t() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqm $$0, btb $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(awf.bf)) {
         avg $$3 = $$2.a(cug.tX) ? avh.iK : avh.iZ;
         this.dR().a($$0, this.dw(), this.dy(), this.dC(), $$3, this.dg(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dR().B) {
            this.gn();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gq() {
      if (!this.dR().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bf = true;
         this.dR().a(this, this.dw(), this.dy(), this.dC(), (float)this.cc * $$0, dcg.a.c);
         this.aq();
         this.gr();
      }
   }

   private void gr() {
      Collection<brp> $$0 = this.ev();
      if (!$$0.isEmpty()) {
         bsd $$1 = new bsd(this.dR(), this.dw(), this.dy(), this.dC());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (brp $$2 : $$0) {
            $$1.a(new brp($$2));
         }

         this.dR().b($$1);
      }
   }

   public boolean x() {
      return this.ao.a(d);
   }

   public void gn() {
      this.ao.a(d, true);
   }

   public boolean go() {
      return this.a() && this.cd < 1;
   }

   public void gp() {
      this.cd++;
   }
}
