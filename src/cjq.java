import javax.annotation.Nullable;

public class cjq extends ciu implements cja, cls {
   private static final ajp<Boolean> b = ajt.a(cjq.class, ajr.k);
   private static final int e = 5;
   private static final int ca = 300;
   private final bqm cb = new bqm(5);

   public cjq(bsj<? extends cjq> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(2, new cnt.a(this, 10.0F));
      this.bU.a(3, new cax<>(this, 1.0, 8.0F));
      this.bU.a(8, new cat(this, 0.6));
      this.bU.a(9, new cae(this, cmh.class, 15.0F, 1.0F));
      this.bU.a(10, new cae(this, bta.class, 15.0F));
      this.bV.a(1, new cbo(this, cnt.class).a());
      this.bV.a(2, new cbp<>(this, cmh.class, true));
      this.bV.a(3, new cbp<>(this, clp.class, false));
      this.bV.a(3, new cbp<>(this, cfa.class, true));
   }

   public static buf.a u() {
      return cjn.gt().a(bug.v, 0.35F).a(bug.s, 24.0).a(bug.c, 5.0).a(bug.m, 32.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cut $$0) {
      return $$0 == cud.vW;
   }

   public boolean gn() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dR());
   }

   @Override
   public ciu.a s() {
      if (this.gn()) {
         return ciu.a.f;
      } else if (this.b(cud.vW)) {
         return ciu.a.e;
      } else {
         return this.ge() ? ciu.a.b : ciu.a.h;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return 0.0F;
   }

   @Override
   public int fM() {
      return 1;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      this.a(bsk.a, new cua(cud.vW));
   }

   @Override
   protected void a(aym $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cua $$2 = this.eT();
         if ($$2.a(cud.vW)) {
            czl.a($$2, daw.b, this.dP(), this.dp(), $$0);
         }
      }
   }

   @Override
   protected ave v() {
      return avf.tV;
   }

   @Override
   protected ave o_() {
      return avf.tX;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.tY;
   }

   @Override
   public void a(bsy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqm y() {
      return this.cb;
   }

   @Override
   protected void b(cir $$0) {
      cua $$1 = $$0.p();
      if ($$1.g() instanceof crv) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cua $$2 = this.cb.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.H());
         }
      }
   }

   private boolean n(cua $$0) {
      return this.gE() && $$0.a(cud.uP);
   }

   @Override
   public btq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cb.b() ? btq.a(this.cb, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cns $$2 = this.gB();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cua $$4 = new cua(cud.vW);
         akj<daq> $$5;
         if ($$0 > $$2.a(bqa.c)) {
            $$5 = daw.d;
         } else if ($$0 > $$2.a(bqa.b)) {
            $$5 = daw.c;
         } else {
            $$5 = null;
         }

         if ($$5 != null) {
            czl.a($$4, $$5, this.dP(), this.dp(), this.dS());
            this.a(bsk.a, $$4);
         }
      }
   }

   @Override
   public ave ae_() {
      return avf.tW;
   }
}
