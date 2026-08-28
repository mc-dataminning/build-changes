import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends dln implements dmc {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final dsv b = dsu.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewm e = dfb.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewm f = dfb.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewm g = dfb.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, je.a.b));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ((je.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eny.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(b) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
