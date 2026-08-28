import com.mojang.serialization.MapCodec;

public class dsw extends dpi {
   public static final MapCodec<dsw> b = b(dsw::new);
   public static final ebx c = ebw.A;

   @Override
   public MapCodec<dsw> a() {
      return b;
   }

   public dsw(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dkc $$0, dko $$1, iw $$2) {
      if (!$$0.A_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(djz $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(a);
      iw $$4 = $$1.a($$3.g());
      eyy $$5 = eyu.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.A_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            ebg $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
