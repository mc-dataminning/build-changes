import com.mojang.serialization.MapCodec;

public class dna extends dme {
   public static final MapCodec<dna> a = b(dna::new);
   private static final xl b = xl.c("container.loom");

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awy.ax);
      }

      return bsh.a;
   }

   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return new bsp(($$2x, $$3, $$4) -> new csz($$2x, $$3, csf.a($$1, $$2)), b);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF);
   }
}
