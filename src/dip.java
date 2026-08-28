import com.mojang.serialization.MapCodec;

public class dip extends dgv {
   public static final MapCodec<dip> a = b(dip::new);
   private static final xd b = xd.c("container.crafting");

   @Override
   public MapCodec<? extends dip> a() {
      return a;
   }

   protected dip(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awn.an);
      }

      return brk.a;
   }

   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return new brs(($$2x, $$3, $$4) -> new crj($$2x, $$3, crd.a($$1, $$2)), b);
   }
}
