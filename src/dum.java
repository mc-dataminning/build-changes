import com.mojang.serialization.MapCodec;

public class dum extends dme {
   public static final MapCodec<dum> b = b(dum::new);

   @Override
   public MapCodec<dum> a() {
      return b;
   }

   public dum(eas.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dmt.a.m();
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(eat $$0) {
      return $$0.a(axc.aV);
   }

   @Override
   protected boolean g(eat $$0) {
      return true;
   }
}
