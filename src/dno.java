import com.mojang.serialization.MapCodec;

public class dno extends dlu {
   public static final MapCodec<dno> a = b(dno::new);
   private static final ww b = ww.c("container.crafting");

   @Override
   public MapCodec<? extends dno> a() {
      return a;
   }

   protected dno(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.an);
      }

      return bty.a;
   }

   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cvd($$2x, $$3, cux.a($$1, $$2)), b);
   }
}
