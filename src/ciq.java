import javax.annotation.Nullable;

public class ciq extends chu implements cia, cks {
   private static final ajm<Boolean> b = ajq.a(ciq.class, ajo.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final bpv bZ = new bpv(5);

   public ciq(brn<? extends ciq> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(2, new cmt.a(this, 10.0F));
      this.bS.a(3, new bzy<>(this, 1.0, 8.0F));
      this.bS.a(8, new bzu(this, 0.6));
      this.bS.a(9, new bzf(this, clh.class, 15.0F, 1.0F));
      this.bS.a(10, new bzf(this, bsc.class, 15.0F));
      this.bT.a(1, new cap(this, cmt.class).a());
      this.bT.a(2, new caq<>(this, clh.class, true));
      this.bT.a(3, new caq<>(this, ckp.class, false));
      this.bT.a(3, new caq<>(this, ceb.class, true));
   }

   public static btg.a u() {
      return cin.gv().a(bth.r, 0.35F).a(bth.q, 24.0).a(bth.c, 5.0).a(bth.k, 32.0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(ctq $$0) {
      return $$0 == ctc.vT;
   }

   public boolean gp() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bg = 0;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dP());
   }

   @Override
   public chu.a r() {
      if (this.gp()) {
         return chu.a.f;
      } else if (this.b(ctc.vT)) {
         return chu.a.e;
      } else {
         return this.gh() ? chu.a.b : chu.a.h;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dP());
      this.a_(true);
   }

   @Override
   public float a(in $$0, dag $$1) {
      return 0.0F;
   }

   @Override
   public int fP() {
      return 1;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      this.a(bro.a, new csz(ctc.vT));
   }

   @Override
   protected void a(ayg $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         csz $$2 = this.eV();
         if ($$2.a(ctc.vT)) {
            $$2.a(cyj.K, 1);
            this.a(bro.a, $$2);
         }
      }
   }

   @Override
   protected avb v() {
      return avc.tH;
   }

   @Override
   protected avb o_() {
      return avc.tJ;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.tK;
   }

   @Override
   public void a(bsa $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bpv y() {
      return this.bZ;
   }

   @Override
   protected void b(chr $$0) {
      csz $$1 = $$0.p();
      if ($$1.f() instanceof cqu) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         csz $$2 = this.bZ.b($$1);
         if ($$2.d()) {
            $$0.am();
         } else {
            $$1.e($$2.G());
         }
      }
   }

   private boolean n(csz $$0) {
      return this.gE() && $$0.a(ctc.uP);
   }

   @Override
   public bsr a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bsr.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cms $$2 = this.gD();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         csz $$4 = new csz(ctc.vT);
         if ($$0 > $$2.a(bpj.c)) {
            $$4.a(cyj.J, 2);
         } else if ($$0 > $$2.a(bpj.b)) {
            $$4.a(cyj.J, 1);
         }

         $$4.a(cyj.I, 1);
         this.a(bro.a, $$4);
      }
   }

   @Override
   public avb ae_() {
      return avc.tI;
   }
}
