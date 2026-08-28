import com.mojang.serialization.MapCodec;

public class dpe extends djs {
   public static final MapCodec<dpe> b = b(dpe::new);
   private static final xh c = xh.c("container.upgrade");

   @Override
   public MapCodec<dpe> a() {
      return b;
   }

   protected dpe(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return new bsg(($$2x, $$3, $$4) -> new ctj($$2x, $$3, crw.a($$1, $$2)), c);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aF);
      }

      return bry.a;
   }
}
