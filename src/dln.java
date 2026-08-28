import com.mojang.serialization.MapCodec;

public class dln extends dkr {
   public static final MapCodec<dln> a = b(dln::new);
   private static final xd b = xd.c("container.loom");

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   protected dln(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awn.ax);
      }

      return brk.a;
   }

   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return new brs(($$2x, $$3, $$4) -> new crx($$2x, $$3, crd.a($$1, $$2)), b);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(aE, $$0.g().g());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE);
   }
}
