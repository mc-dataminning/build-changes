import com.mojang.serialization.MapCodec;

public class dlg extends djm {
   public static final MapCodec<dlg> a = b(dlg::new);
   private static final wo b = wo.c("container.crafting");

   @Override
   public MapCodec<? extends dlg> a() {
      return a;
   }

   protected dlg(dww.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.an);
      }

      return bsj.a;
   }

   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new csv($$2x, $$3, csp.a($$1, $$2)), b);
   }
}
