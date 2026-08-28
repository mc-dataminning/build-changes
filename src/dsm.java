import com.mojang.serialization.MapCodec;

public class dsm extends drp {
   public static final MapCodec<dsm> a = b(dsm::new);
   private static final xg b = xg.c("container.loom");

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   protected dsm(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.ax);
      }

      return bvc.a;
   }

   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cxi($$2x, $$3, cwo.a($$1, $$2)), b);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e);
   }
}
