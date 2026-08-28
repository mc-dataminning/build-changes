import com.mojang.serialization.MapCodec;

public class doz extends dlp {
   public static final MapCodec<doz> b = b(doz::new);
   public static final dxn c = dxm.B;

   @Override
   public MapCodec<doz> a() {
      return b;
   }

   public doz(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dgk $$0, dgw $$1, ji $$2) {
      if (!$$0.B_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dgh $$0, ji $$1, dww $$2) {
      jn $$3 = $$2.c(a);
      ji $$4 = $$1.a($$3.g());
      eug $$5 = euc.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            dww $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.U().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
