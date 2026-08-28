import com.mojang.serialization.MapCodec;

public class doc extends dip {
   public static final MapCodec<doc> b = b(doc::new);
   private static final xd c = xd.c("container.upgrade");

   @Override
   public MapCodec<doc> a() {
      return b;
   }

   protected doc(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return new brs(($$2x, $$3, $$4) -> new csq($$2x, $$3, crd.a($$1, $$2)), c);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awn.aF);
      }

      return brk.a;
   }
}
