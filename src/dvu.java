import com.mojang.serialization.MapCodec;

public class dvu extends dnv {
   public static final MapCodec<dvu> g = b(dvu::new);

   @Override
   public MapCodec<dvu> a() {
      return g;
   }

   public dvu(eas.d $$0) {
      super(() -> dxt.c, $$0);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzq($$0, $$1);
   }

   @Override
   protected awu<alg> c() {
      return awx.i.b(awx.ai);
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return azm.a(dxz.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
