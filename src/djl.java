import com.mojang.serialization.MapCodec;

public class djl extends dgd {
   public static final MapCodec<djl> b = b(djl::new);
   public static final dru c = drt.w;

   @Override
   public MapCodec<djl> a() {
      return b;
   }

   public djl(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dba $$0, io $$1) {
      if (!$$0.x_() && !$$0.O().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(daz $$0, io $$1, drd $$2) {
      it $$3 = $$2.c(a);
      io $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.O().a($$2, this)) {
            drd $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.O().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
