import com.mojang.serialization.MapCodec;

public class dsb extends dnc {
   public static final MapCodec<dsb> a = b(dsb::new);
   private static final int b = 20;

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(ebd.d $$0) {
      super($$0);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
      if (!$$3.cd() && $$3 instanceof bxu) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dnj.b($$1, $$2.d(), $$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.b && $$6.a(dne.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
