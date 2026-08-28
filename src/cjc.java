import java.util.Collection;
import javax.annotation.Nullable;

public class cjc extends cjq implements bto {
   private static final ajp<Integer> b = ajt.a(cjc.class, ajr.b);
   private static final ajp<Boolean> c = ajt.a(cjc.class, ajr.k);
   private static final ajp<Boolean> d = ajt.a(cjc.class, ajr.k);
   private int e;
   private int ca;
   private int cb = 30;
   private int cc = 3;
   private int cd;

   public cjc(bsm<? extends cjc> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzt(this));
      this.bU.a(2, new cbg(this));
      this.bU.a(3, new bzg<>(this, cff.class, 6.0F, 1.0, 1.2));
      this.bU.a(3, new bzg<>(this, ceu.class, 6.0F, 1.0, 1.2));
      this.bU.a(4, new caj(this, 1.0, false));
      this.bU.a(5, new cbm(this, 0.8));
      this.bU.a(6, new cah(this, cmk.class, 8.0F));
      this.bU.a(6, new cau(this));
      this.bV.a(1, new cbs<>(this, cmk.class, true));
      this.bV.a(2, new cbr(this));
   }

   public static bui.a s() {
      return cjq.gu().a(buj.v, 0.25);
   }

   @Override
   public int cy() {
      return this.p() == null ? this.v(0.0F) : this.v(this.ex() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqz $$2) {
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
      $$0.a("ignited", this.y());
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
         this.go();
      }
   }

   @Override
   public void l() {
      if (this.bE()) {
         this.e = this.ca;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.ca == 0) {
            this.a(avh.gk, 1.0F, 0.5F);
            this.a(dxg.I);
         }

         this.ca += $$0;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.ca >= this.cb) {
            this.ca = this.cb;
            this.gr();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable btb $$0) {
      if (!($$0 instanceof cgr)) {
         super.h($$0);
      }
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.gj;
   }

   @Override
   protected avg o_() {
      return avh.gi;
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      bsg $$2 = $$0.d();
      if ($$2 != this && $$2 instanceof cjc $$3 && $$3.gp()) {
         $$3.gq();
         this.a(cuf.up);
      }
   }

   @Override
   public boolean D(bsg $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float H(float $$0) {
      return ayg.i($$0, (float)this.e, (float)this.ca) / (float)(this.cb - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqm $$0, bta $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(awf.bf)) {
         avg $$3 = $$2.a(cuf.tX) ? avh.iK : avh.iZ;
         this.dQ().a($$0, this.dv(), this.dx(), this.dB(), $$3, this.df(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dQ().B) {
            this.go();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gr() {
      if (!this.dQ().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dQ().a(this, this.dv(), this.dx(), this.dB(), (float)this.cc * $$0, dcf.a.c);
         this.ap();
         this.gs();
      }
   }

   private void gs() {
      Collection<bro> $$0 = this.eu();
      if (!$$0.isEmpty()) {
         bsc $$1 = new bsc(this.dQ(), this.dv(), this.dx(), this.dB());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bro $$2 : $$0) {
            $$1.a(new bro($$2));
         }

         this.dQ().b($$1);
      }
   }

   public boolean y() {
      return this.ao.a(d);
   }

   public void go() {
      this.ao.a(d, true);
   }

   public boolean gp() {
      return this.a() && this.cd < 1;
   }

   public void gq() {
      this.cd++;
   }
}
