import com.mojang.serialization.MapCodec;

public class dve extends dpj {
   public static final MapCodec<dve> b = b(dve::new);
   private static final xg c = xg.c("container.upgrade");

   @Override
   public MapCodec<dve> a() {
      return b;
   }

   protected dve(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cyc($$2x, $$3, cwo.a($$1, $$2)), c);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.aF);
      }

      return bvc.a;
   }
}
