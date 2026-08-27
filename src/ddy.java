import com.mojang.serialization.MapCodec;

public class ddy extends dar {
   public static final MapCodec<ddy> b = b(ddy::new);
   public static final dlw c = dlv.w;

   @Override
   public MapCodec<ddy> a() {
      return b;
   }

   public ddy(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cvo $$0, hz $$1) {
      if (!$$0.y_() && !$$0.N().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cvn $$0, hz $$1, dlf $$2) {
      ie $$3 = $$2.c(a);
      hz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.N().a($$2, this)) {
            dlf $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.N().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
