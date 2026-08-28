import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dju extends dey implements dlz {
   public static final MapCodec<dju> a = b(dju::new);
   public static final dss b = dsr.C;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   protected dju(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsb $$0, dsb $$1, je $$2) {
      return $$1.a(dfa.ac) && $$2.o() == je.a.b;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == env.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(b) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
