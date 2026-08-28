import com.mojang.serialization.MapCodec;

public class drd extends dqg {
   public static final MapCodec<drd> a = b(drd::new);
   private static final wy b = wy.c("container.loom");

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   protected drd(eag.d $$0) {
      super($$0);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ax);
      }

      return bud.a;
   }

   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cwc($$2x, $$3, cvi.a($$1, $$2)), b);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e);
   }
}
