import com.mojang.serialization.MapCodec;

public class djs extends dhy {
   public static final MapCodec<djs> a = b(djs::new);
   private static final xh b = xh.c("container.crafting");

   @Override
   public MapCodec<? extends djs> a() {
      return a;
   }

   protected djs(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.an);
      }

      return bry.a;
   }

   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return new bsg(($$2x, $$3, $$4) -> new csc($$2x, $$3, crw.a($$1, $$2)), b);
   }
}
