import com.mojang.serialization.MapCodec;

public class dou extends djw {
   public static final MapCodec<dou> a = b(dou::new);
   protected static final fbu b = djm.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djo.ek) || super.b($$0, $$1, $$2);
   }
}
