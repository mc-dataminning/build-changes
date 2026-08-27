import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class chv extends cin implements cir {
   private static final int b = 20;
   private static final int c = 40;
   private final bzx<chv> d = new bzx<>(this, 1.0, 20, 15.0F);
   private final bzh e = new bzh(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         chv.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         chv.this.v(true);
      }
   };

   protected chv(brn<? extends chv> $$0, dad $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new caa(this));
      this.bS.a(3, new byq(this, 1.0));
      this.bS.a(3, new bye<>(this, ces.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cak(this, 1.0));
      this.bS.a(6, new bzf(this, clh.class, 8.0F));
      this.bS.a(6, new bzs(this));
      this.bT.a(1, new cap(this));
      this.bT.a(2, new caq<>(this, clh.class, true));
      this.bT.a(3, new caq<>(this, ceb.class, true));
      this.bT.a(3, new caq<>(this, ceq.class, 10, true, false, ceq.bY));
   }

   public static btg.a r() {
      return cin.gv().a(bth.r, 0.25);
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avb u();

   @Override
   public void n_() {
      boolean $$0 = this.gj();
      if ($$0) {
         csz $$1 = this.d(bro.f);
         if (!$$1.d()) {
            if ($$1.k()) {
               $$1.b($$1.m() + this.ah.a(2));
               if ($$1.m() >= $$1.n()) {
                  this.e(bro.f);
                  this.a(bro.f, csz.i);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.n_();
   }

   @Override
   public void t() {
      super.t();
      if (this.db() instanceof bsi $$0) {
         this.aZ = $$0.aZ;
      }
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      super.a($$0, $$1);
      this.a(bro.a, new csz(ctc.ou));
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayg $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.d(bro.f).d()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bro.f, new csz($$4.i() < 0.1F ? ddg.ef : ddg.ee));
            this.bV[bro.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dN() != null && !this.dN().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         csz $$0 = this.b(cmb.a(this, ctc.ou));
         if ($$0.a(ctc.ou)) {
            int $$1 = this.gp();
            if (this.dN().ak() != bpj.d) {
               $$1 = this.gq();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int gp() {
      return 20;
   }

   protected int gq() {
      return 40;
   }

   @Override
   public void a(bsa $$0, float $$1) {
      csz $$2 = this.g(this.b(cmb.a(this, ctc.ou)));
      cln $$3 = this.b($$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().ak().a() * 4));
      this.a(avc.wZ, 1.0F, 1.0F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   protected cln b(csz $$0, float $$1) {
      return cmb.a(this, $$0, $$1);
   }

   @Override
   public boolean a(ctq $$0) {
      return $$0 == ctc.ou;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bro $$0, csz $$1) {
      super.a($$0, $$1);
      if (!this.dN().B) {
         this.y();
      }
   }

   public boolean gr() {
      return this.cm();
   }
}
