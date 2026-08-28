import com.mojang.serialization.MapCodec;

public class dnh extends dml {
   public static final MapCodec<dnh> a = b(dnh::new);
   private static final xj b = xj.c("container.loom");

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   protected dnh(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awx.ax);
      }

      return bsk.a;
   }

   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return new bss(($$2x, $$3, $$4) -> new ctg($$2x, $$3, csm.a($$1, $$2)), b);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF);
   }
}
