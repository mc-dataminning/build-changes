import com.mojang.serialization.MapCodec;

public class daq extends ddj {
   public static final MapCodec<daq> a = b(daq::new);

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public daq(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ic.a.b));
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ai().k());
   }
}
