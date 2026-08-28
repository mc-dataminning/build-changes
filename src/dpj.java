import com.mojang.serialization.MapCodec;

public class dpj extends dno {
   public static final MapCodec<dpj> a = b(dpj::new);
   private static final xg b = xg.c("container.crafting");

   @Override
   public MapCodec<? extends dpj> a() {
      return a;
   }

   protected dpj(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.an);
      }

      return bvc.a;
   }

   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cwu($$2x, $$3, cwo.a($$1, $$2)), b);
   }
}
