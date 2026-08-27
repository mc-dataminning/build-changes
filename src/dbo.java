import com.mojang.serialization.MapCodec;

public class dbo extends daa {
   public static final MapCodec<dbo> a = b(dbo::new);
   public static final dnq b = dnp.w;
   public static final dnq c = dnp.r;

   @Override
   protected MapCodec<? extends dbo> a() {
      return a;
   }

   public dbo(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof apf $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof apf $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dmz $$0, apf $$1, ib $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dmz $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? aty.fw : aty.fx, atz.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
