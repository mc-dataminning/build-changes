import com.mojang.serialization.MapCodec;

public class dwl extends dwd {
   public static final MapCodec<dwl> a = b(dwl::new);
   private static final ffw b = dmr.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dwl> a() {
      return a;
   }

   protected dwl(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1 instanceof arq && $$3 instanceof ctx) {
         $$1.a(new iv($$2), true, $$3);
      }
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      exa $$3 = $$1.b_($$2);
      exa $$4 = $$1.b_($$2.d());
      return ($$3.a() == exb.c || $$0.b() instanceof dqu) && $$4.a() == exb.a;
   }
}
