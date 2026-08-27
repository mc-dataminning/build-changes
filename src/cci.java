import java.util.Collection;
import javax.annotation.Nullable;

public class cci extends ccw implements bnb {
   private static final agn<Integer> b = agq.a(cci.class, agp.b);
   private static final agn<Boolean> c = agq.a(cci.class, agp.k);
   private static final agn<Boolean> d = agq.a(cci.class, agp.k);
   private int e;
   private int bU;
   private int bV = 30;
   private int bW = 3;
   private int bX;

   public cci(bmc<? extends cci> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bte(this));
      this.bP.a(2, new bur(this));
      this.bP.a(3, new bsr<>(this, byq.class, 6.0F, 1.0, 1.2));
      this.bP.a(3, new bsr<>(this, byf.class, 6.0F, 1.0, 1.2));
      this.bP.a(4, new btu(this, 1.0, false));
      this.bP.a(5, new bux(this, 0.8));
      this.bP.a(6, new bts(this, cfq.class, 8.0F));
      this.bP.a(6, new buf(this));
      this.bQ.a(1, new bvd<>(this, cfq.class, true));
      this.bQ.a(2, new bvc(this));
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.o, 0.25);
   }

   @Override
   public int cu() {
      return this.q() == null ? 3 : 3 + (int)(this.ev() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bU += (int)($$0 * 1.5F);
      if (this.bU > this.bV - 5) {
         this.bU = this.bV - 5;
      }

      return $$3;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, -1);
      this.an.a(c, false);
      this.an.a(d, false);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bV);
      $$0.a("ExplosionRadius", (byte)this.bW);
      $$0.a("ignited", this.A());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.an.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bV = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bW = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gf();
      }
   }

   @Override
   public void l() {
      if (this.bx()) {
         this.e = this.bU;
         if (this.A()) {
            this.b(1);
         }

         int $$0 = this.w();
         if ($$0 > 0 && this.bU == 0) {
            this.a(art.fW, 1.0F, 0.5F);
            this.b(dnz.I);
         }

         this.bU += $$0;
         if (this.bU < 0) {
            this.bU = 0;
         }

         if (this.bU >= this.bV) {
            this.bU = this.bV;
            this.gi();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bmo $$0) {
      if (!($$0 instanceof caa)) {
         super.h($$0);
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return art.fV;
   }

   @Override
   protected ars n_() {
      return art.fU;
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      blw $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cci $$4 && $$4.gg()) {
         $$4.gh();
         this.a(cnj.ul);
      }
   }

   @Override
   public boolean B(blw $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float D(float $$0) {
      return aup.i($$0, (float)this.e, (float)this.bU) / (float)(this.bV - 2);
   }

   public int w() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(ane $$0, bmn $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(asq.aF)) {
         ars $$3 = $$2.a(cnj.tV) ? art.iv : art.iK;
         this.dL().a($$0, this.dq(), this.ds(), this.dw(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dL().B) {
            this.gf();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bkc.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gi() {
      if (!this.dL().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.bW * $$0, ctx.a.c);
         this.am();
         this.gj();
      }
   }

   private void gj() {
      Collection<blj> $$0 = this.es();
      if (!$$0.isEmpty()) {
         blt $$1 = new blt(this.dL(), this.dq(), this.ds(), this.dw());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (blj $$2 : $$0) {
            $$1.a(new blj($$2));
         }

         this.dL().b($$1);
      }
   }

   public boolean A() {
      return this.an.b(d);
   }

   public void gf() {
      this.an.b(d, true);
   }

   public boolean gg() {
      return this.a() && this.bX < 1;
   }

   public void gh() {
      this.bX++;
   }
}
