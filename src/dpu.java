import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpu extends dku implements dsb {
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final dzd b = dzc.I;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   protected dpu(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dym $$0, dym $$1, jo $$2) {
      return $$1.a(dkw.ag) && $$2.o() == jo.a.b;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == euu.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }
}
