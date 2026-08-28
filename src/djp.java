import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djp extends dfb implements dmc {
   public static final MapCodec<djp> a = b(djp::new);
   public static final int b = 15;
   public static final dte c = dsu.aP;
   public static final dsv d = dsu.C;
   public static final ToIntFunction<dse> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqw.a;
      } else {
         return bqw.c;
      }
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return $$3.a(cuu.hC) ? ewj.b() : ewj.a();
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.a;
   }

   @Override
   protected float d(dse $$0, dbg $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(d) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cur a(cur $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(km.ab, cxc.a.a(c, $$1));
      }

      return $$0;
   }
}
