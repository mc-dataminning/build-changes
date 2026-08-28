import com.mojang.serialization.MapCodec;

public class dnv extends dnc {
   public static final MapCodec<dnv> a = b(dnv::new);
   private static final fgk b = dnc.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dnv> a() {
      return a;
   }

   public dnv(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return !$$1.v($$2.e());
   }
}
