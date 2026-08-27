import java.util.Collection;
import javax.annotation.Nullable;

public class bvo extends bwc implements bgm {
   private static final aby<Integer> b = acb.a(bvo.class, aca.b);
   private static final aby<Boolean> c = acb.a(bvo.class, aca.k);
   private static final aby<Boolean> d = acb.a(bvo.class, aca.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public bvo(bfn<? extends bvo> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      this.bO.a(1, new bmp(this));
      this.bO.a(2, new boc(this));
      this.bO.a(3, new bmc<>(this, brz.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bmc<>(this, bro.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bnf(this, 1.0, false));
      this.bO.a(5, new boi(this, 0.8));
      this.bO.a(6, new bnd(this, byo.class, 8.0F));
      this.bO.a(6, new bnq(this));
      this.bP.a(1, new boo<>(this, byo.class, true));
      this.bP.a(2, new bon(this));
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.d, 0.25);
   }

   @Override
   public int cr() {
      return this.j() == null ? 3 : 3 + (int)(this.er() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, ben $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bT += (int)($$0 * 1.5F);
      if (this.bT > this.bU - 5) {
         this.bT = this.bU - 5;
      }

      return $$3;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, -1);
      this.am.a(c, false);
      this.am.a(d, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.am.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.w());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.am.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bU = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bV = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.fY();
      }
   }

   @Override
   public void l() {
      if (this.bs()) {
         this.e = this.bT;
         if (this.w()) {
            this.b(1);
         }

         int $$0 = this.r();
         if ($$0 > 0 && this.bT == 0) {
            this.a(amh.fg, 1.0F, 0.5F);
            this.a(dgl.J);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gb();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bfz $$0) {
      if (!($$0 instanceof btg)) {
         super.h($$0);
      }
   }

   @Override
   protected amg d(ben $$0) {
      return amh.ff;
   }

   @Override
   protected amg g_() {
      return amh.fe;
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bfj $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof bvo $$4 && $$4.fZ()) {
         $$4.ga();
         this.a(cgc.tv);
      }
   }

   @Override
   public boolean z(bfj $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.am.b(c);
   }

   public float D(float $$0) {
      return apa.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int r() {
      return this.am.b(b);
   }

   public void b(int $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a(aif $$0, bfy $$1) {
      super.a($$0, $$1);
      this.am.b(c, true);
   }

   @Override
   protected bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ($$2.a(ane.aF)) {
         amg $$3 = $$2.a(cgc.tf) ? amh.hD : amh.hS;
         this.dI().a($$0, this.dn(), this.dp(), this.dt(), $$3, this.cY(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dI().B) {
            this.fY();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bdx.a(this.dI().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gb() {
      if (!this.dI().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bb = true;
         this.dI().a(this, this.dn(), this.dp(), this.dt(), (float)this.bV * $$0, cmm.a.c);
         this.ai();
         this.gc();
      }
   }

   private void gc() {
      Collection<bfa> $$0 = this.eo();
      if (!$$0.isEmpty()) {
         bfg $$1 = new bfg(this.dI(), this.dn(), this.dp(), this.dt());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bfa $$2 : $$0) {
            $$1.a(new bfa($$2));
         }

         this.dI().b($$1);
      }
   }

   public boolean w() {
      return this.am.b(d);
   }

   public void fY() {
      this.am.b(d, true);
   }

   public boolean fZ() {
      return this.a() && this.bW < 1;
   }

   public void ga() {
      this.bW++;
   }
}
