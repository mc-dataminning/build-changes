import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djm extends dey implements dlz {
   public static final MapCodec<djm> a = b(djm::new);
   public static final int b = 15;
   public static final dtb c = dsr.aP;
   public static final dss d = dsr.C;
   public static final ToIntFunction<dsb> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   public djm(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqt.a;
      } else {
         return bqt.c;
      }
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return $$3.a(cur.hC) ? ewg.b() : ewg.a();
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.a;
   }

   @Override
   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(d) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuo a(cuo $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(km.ab, cwz.a.a(c, $$1));
      }

      return $$0;
   }
}
