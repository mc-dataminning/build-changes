import java.util.Collection;
import javax.annotation.Nullable;

public class ciz extends cjn implements btl {
   private static final ajp<Integer> b = ajt.a(ciz.class, ajr.b);
   private static final ajp<Boolean> c = ajt.a(ciz.class, ajr.k);
   private static final ajp<Boolean> d = ajt.a(ciz.class, ajr.k);
   private int e;
   private int ca;
   private int cb = 30;
   private int cc = 3;
   private int cd;

   public ciz(bsj<? extends ciz> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzq(this));
      this.bU.a(2, new cbd(this));
      this.bU.a(3, new bzd<>(this, cfc.class, 6.0F, 1.0, 1.2));
      this.bU.a(3, new bzd<>(this, cer.class, 6.0F, 1.0, 1.2));
      this.bU.a(4, new cag(this, 1.0, false));
      this.bU.a(5, new cbj(this, 0.8));
      this.bU.a(6, new cae(this, cmh.class, 8.0F));
      this.bU.a(6, new car(this));
      this.bV.a(1, new cbp<>(this, cmh.class, true));
      this.bV.a(2, new cbo(this));
   }

   public static buf.a s() {
      return cjn.gt().a(bug.v, 0.25);
   }

   @Override
   public int cx() {
      return this.p() == null ? this.v(0.0F) : this.v(this.ew() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
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
         this.gn();
      }
   }

   @Override
   public void l() {
      if (this.bD()) {
         this.e = this.ca;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.ca == 0) {
            this.a(avf.gk, 1.0F, 0.5F);
            this.a(dxa.I);
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
   public void h(@Nullable bsy $$0) {
      if (!($$0 instanceof cgo)) {
         super.h($$0);
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.gj;
   }

   @Override
   protected ave o_() {
      return avf.gi;
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      bsd $$2 = $$0.d();
      if ($$2 != this && $$2 instanceof ciz $$3 && $$3.go()) {
         $$3.gp();
         this.a(cud.up);
      }
   }

   @Override
   public boolean D(bsd $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float H(float $$0) {
      return aye.i($$0, (float)this.e, (float)this.ca) / (float)(this.cb - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqk $$0, bsx $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(awd.bf)) {
         ave $$3 = $$2.a(cud.tX) ? avf.iK : avf.iZ;
         this.dP().a($$0, this.du(), this.dw(), this.dA(), $$3, this.de(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dP().B) {
            this.gn();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqd.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gq() {
      if (!this.dP().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.cc * $$0, dcd.a.c);
         this.ao();
         this.gr();
      }
   }

   private void gr() {
      Collection<brl> $$0 = this.et();
      if (!$$0.isEmpty()) {
         brz $$1 = new brz(this.dP(), this.du(), this.dw(), this.dA());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (brl $$2 : $$0) {
            $$1.a(new brl($$2));
         }

         this.dP().b($$1);
      }
   }

   public boolean y() {
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
