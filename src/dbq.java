import com.mojang.serialization.MapCodec;

public class dbq extends dac {
   public static final MapCodec<dbq> a = b(dbq::new);
   public static final dns b = dnr.w;
   public static final dns c = dnr.r;

   @Override
   protected MapCodec<? extends dbq> a() {
      return a;
   }

   public dbq(dna.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof apf $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof apf $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dnb $$0, apf $$1, ib $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dnb $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? aty.fA : aty.fB, atz.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
