import com.mojang.serialization.MapCodec;

public class drq extends dmr {
   public static final MapCodec<drq> a = b(drq::new);
   private static final int b = 20;

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(eas.d $$0) {
      super($$0);
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bwi $$3) {
      if (!$$3.cc() && $$3 instanceof bxj) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dmy.b($$1, $$2.d(), $$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.b && $$6.a(dmt.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
