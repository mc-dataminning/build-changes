import com.mojang.serialization.MapCodec;

public class drq extends dly {
   public static final MapCodec<drq> b = b(drq::new);
   private static final wp c = wp.c("container.upgrade");

   @Override
   public MapCodec<drq> a() {
      return b;
   }

   protected drq(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new cuw($$2x, $$3, ctj.a($$1, $$2)), c);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aF);
      }

      return bsy.a;
   }
}
