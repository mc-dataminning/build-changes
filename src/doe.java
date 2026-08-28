import com.mojang.serialization.MapCodec;

public class doe extends dni {
   public static final MapCodec<doe> a = b(doe::new);
   private static final wo b = wo.c("container.loom");

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   protected doe(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awj.ax);
      }

      return bsi.a;
   }

   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return new bsq(($$2x, $$3, $$4) -> new cth($$2x, $$3, csn.a($$1, $$2)), b);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF);
   }
}
