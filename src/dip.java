import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dip extends dey implements dlz {
   public static final MapCodec<dip> a = b(dip::new);
   private static final dss c = dsr.C;
   protected static final ewj b = dey.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   protected dip(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(c) ? env.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = super.a($$0);
      if ($$1 != null) {
         enu $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == env.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsb $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, je.a);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !this.a($$0, $$3, $$4)) {
         return dfa.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
