import com.mojang.serialization.MapCodec;

public class dnk extends dmr {
   public static final MapCodec<dnk> a = b(dnk::new);
   private static final ffw b = dmr.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dnk> a() {
      return a;
   }

   public dnk(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return !$$1.v($$2.e());
   }
}
