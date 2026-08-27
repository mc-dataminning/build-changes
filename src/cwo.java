import com.mojang.serialization.MapCodec;

public class cwo extends cva {
   public static final MapCodec<cwo> a = b(cwo::new);
   public static final dhz b = dhy.w;
   public static final dhz c = dhy.r;

   @Override
   protected MapCodec<? extends cwo> a() {
      return a;
   }

   public cwo(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if ($$3.b() != $$0.b()) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(b)) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      boolean $$4 = $$1.B($$2);
      if ($$4 != $$0.c(b)) {
         dhi $$5 = $$0;
         if (!$$0.c(b)) {
            $$5 = $$0.a(c);
            $$1.a(null, $$2, $$5.c(c) ? aqr.eU : aqr.eV, aqs.e);
         }

         $$1.a($$2, $$5.a(b, Boolean.valueOf($$4)), 3);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
