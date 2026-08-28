import com.mojang.serialization.MapCodec;

public class dtg extends dps {
   public static final MapCodec<dtg> b = b(dtg::new);
   public static final ech c = ecg.A;

   @Override
   public MapCodec<dtg> a() {
      return b;
   }

   public dtg(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dkm $$0, dky $$1, iw $$2) {
      if (!$$0.A_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dkj $$0, iw $$1, ebq $$2) {
      jc $$3 = $$2.c(a);
      iw $$4 = $$1.a($$3.g());
      ezi $$5 = eze.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.A_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            ebq $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
