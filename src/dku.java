import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dku extends dfy implements dna {
   public static final MapCodec<dku> a = b(dku::new);
   public static final dtt b = dts.C;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   protected dku(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, ji $$2) {
      return $$1.a(dga.ac) && $$2.o() == ji.a.b;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}
