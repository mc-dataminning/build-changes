import com.mojang.serialization.MapCodec;

public class dse extends doq {
   public static final MapCodec<dse> b = b(dse::new);
   public static final ebf c = ebe.A;

   @Override
   public MapCodec<dse> a() {
      return b;
   }

   public dse(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(djk $$0, djw $$1, iv $$2) {
      if (!$$0.w_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(djh $$0, iv $$1, eao $$2) {
      jb $$3 = $$2.c(a);
      iv $$4 = $$1.a($$3.g());
      eyd $$5 = exz.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            eao $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
