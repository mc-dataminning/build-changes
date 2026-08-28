import com.mojang.serialization.MapCodec;

public class dva extends dnd {
   public static final MapCodec<dva> g = b(dva::new);

   @Override
   public MapCodec<dva> a() {
      return g;
   }

   public dva(dzy.d $$0) {
      super(() -> dwz.c, $$0);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyw($$0, $$1);
   }

   @Override
   protected awu<alg> c() {
      return awx.i.b(awx.ai);
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return azm.a(dxf.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
