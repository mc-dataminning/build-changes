import com.mojang.serialization.MapCodec;

public class dtg extends dno {
   public static final MapCodec<dtg> b = b(dtg::new);
   private static final ww c = ww.c("container.upgrade");

   @Override
   public MapCodec<dtg> a() {
      return b;
   }

   protected dtg(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cwk($$2x, $$3, cux.a($$1, $$2)), c);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.aF);
      }

      return bty.a;
   }
}
