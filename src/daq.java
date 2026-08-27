import com.mojang.serialization.MapCodec;

public class daq extends czu {
   public static final MapCodec<daq> a = b(daq::new);
   private static final vb b = vb.c("container.loom");

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   protected daq(dio.d $$0) {
      super($$0);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arm.ax);
         return bjl.b;
      }
   }

   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return new bju(($$2x, $$3, $$4) -> new cip($$2x, $$3, chv.a($$1, $$2)), b);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE);
   }
}
