import com.mojang.serialization.MapCodec;

public class dsy extends dlh {
   public static final MapCodec<dsy> g = b(dsy::new);

   @Override
   public MapCodec<dsy> a() {
      return g;
   }

   public dsy(dxp.d $$0) {
      super(() -> duu.c, $$0);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwo($$0, $$1);
   }

   @Override
   protected awh<aku> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return ayz.a(duz.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
