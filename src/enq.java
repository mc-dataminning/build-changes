import com.mojang.serialization.MapCodec;

public class enq extends enj {
   public static final MapCodec<enq> b = dzz.a.fieldOf("state").xmap(dzy.a::b, dma::m).xmap(enq::new, $$0 -> $$0.c);
   private final dma c;

   public enq(dma $$0) {
      this.c = $$0;
   }

   @Override
   protected enk<?> a() {
      return enk.f;
   }

   @Override
   public dzz a(azv $$0, iu $$1) {
      ja.a $$2 = ja.a.a($$0);
      return this.c.m().c(dss.d, $$2);
   }
}
