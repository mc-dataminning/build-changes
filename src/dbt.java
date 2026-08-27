import com.mojang.serialization.MapCodec;

public class dbt extends cym {
   public static final MapCodec<dbt> b = b(dbt::new);
   public static final djr c = djq.w;

   @Override
   public MapCodec<dbt> a() {
      return b;
   }

   public dbt(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, c);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(ctj $$0, hx $$1) {
      if (!$$0.y_() && !$$0.N().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cti $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(a);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.N().a($$2, this)) {
            dja $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.N().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
