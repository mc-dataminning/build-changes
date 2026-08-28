import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dis extends dfb implements dmc {
   public static final MapCodec<dis> a = b(dis::new);
   private static final dsv c = dsu.C;
   protected static final ewm b = dfb.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   protected dis(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = super.a($$0);
      if ($$1 != null) {
         enx $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eny.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.c();
      dse $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, je.a);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !this.a($$0, $$3, $$4)) {
         return dfd.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
