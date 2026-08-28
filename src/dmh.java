import com.mojang.serialization.MapCodec;

public abstract class dmh extends dmr {
   private static final ffw a = dmr.b(4.0, 0.0, 10.0);

   protected dmh(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmh> a();

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return a($$1, $$2.e(), jb.b);
   }
}
