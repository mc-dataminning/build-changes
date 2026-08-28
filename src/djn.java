import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djn extends dez implements dma {
   public static final MapCodec<djn> a = b(djn::new);
   public static final int b = 15;
   public static final dtc c = dss.aP;
   public static final dst d = dss.C;
   public static final ToIntFunction<dsc> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqu.a;
      } else {
         return bqu.c;
      }
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return $$3.a(cus.hC) ? ewh.b() : ewh.a();
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.a;
   }

   @Override
   protected float d(dsc $$0, dbe $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(d) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cup a(cup $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(km.ab, cxa.a.a(c, $$1));
      }

      return $$0;
   }
}
