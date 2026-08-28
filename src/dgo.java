import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgo extends den implements dmc {
   public static final MapCodec<dgo> a = b(dgo::new);
   public static final dsv b = dsu.C;
   private static final int d = 3;
   protected static final ewm c = dfb.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.z, $$0.B ? dpv::a : dpv::b);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.b;
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(b) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
