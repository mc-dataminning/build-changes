import com.mojang.serialization.MapCodec;

public class dqx extends dlg {
   public static final MapCodec<dqx> b = b(dqx::new);
   private static final wp c = wp.c("container.upgrade");

   @Override
   public MapCodec<dqx> a() {
      return b;
   }

   protected dqx(dww.d $$0) {
      super($$0);
   }

   @Override
   protected bsm b(dwx $$0, dgi $$1, ji $$2) {
      return new bss(($$2x, $$3, $$4) -> new cuc($$2x, $$3, csp.a($$1, $$2)), c);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aF);
      }

      return bsk.a;
   }
}
