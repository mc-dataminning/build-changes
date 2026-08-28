import com.mojang.serialization.MapCodec;

public class dpb extends dlr {
   public static final MapCodec<dpb> b = b(dpb::new);
   public static final dxp c = dxo.B;

   @Override
   public MapCodec<dpb> a() {
      return b;
   }

   public dpb(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dgm $$0, dgy $$1, ji $$2) {
      if (!$$0.B_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dgj $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(a);
      ji $$4 = $$1.a($$3.g());
      eui $$5 = eue.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            dwy $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.U().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
