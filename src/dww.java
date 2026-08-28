import com.mojang.serialization.MapCodec;

public class dww extends dwo {
   public static final MapCodec<dww> a = b(dww::new);
   private static final fgk b = dnc.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dww> a() {
      return a;
   }

   protected dww(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1 instanceof ars && $$3 instanceof cui) {
         $$1.a(new iv($$2), true, $$3);
      }
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      exo $$3 = $$1.b_($$2);
      exo $$4 = $$1.b_($$2.d());
      return ($$3.a() == exp.c || $$0.b() instanceof drf) && $$4.a() == exp.a;
   }
}
