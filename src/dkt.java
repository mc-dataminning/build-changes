import com.mojang.serialization.MapCodec;

public class dkt extends dhl {
   public static final MapCodec<dkt> b = b(dkt::new);
   public static final dtc c = dtb.w;

   @Override
   public MapCodec<dkt> a() {
      return b;
   }

   public dkt(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dch $$0, ja $$1) {
      if (!$$0.x_() && !$$0.P().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dcg $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(a);
      ja $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.P().a($$2, this)) {
            dsl $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.P().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
