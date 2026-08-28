import com.mojang.serialization.MapCodec;

public class dkq extends dhi {
   public static final MapCodec<dkq> b = b(dkq::new);
   public static final dsy c = dsx.w;

   @Override
   public MapCodec<dkq> a() {
      return b;
   }

   public dkq(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dce $$0, ja $$1) {
      if (!$$0.x_() && !$$0.P().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dcd $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(a);
      ja $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.P().a($$2, this)) {
            dsh $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.P().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
