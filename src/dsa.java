import com.mojang.serialization.MapCodec;

public class dsa extends drd {
   public static final MapCodec<dsa> a = b(dsa::new);
   private static final xa b = xa.c("container.loom");

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   protected dsa(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.ax);
      }

      return bur.a;
   }

   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cwx($$2x, $$3, cwd.a($$1, $$2)), b);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e);
   }
}
