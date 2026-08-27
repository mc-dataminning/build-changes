import com.mojang.serialization.MapCodec;

public class dbn extends cws {
   public static final MapCodec<dbn> a = b(dbn::new);
   protected static final emf b = cwj.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   public dbn(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(asb.aK) || $$0.a(cwl.dX) || super.b($$0, $$1, $$2);
   }
}
