import com.mojang.serialization.MapCodec;

public class dwr extends dos {
   public static final MapCodec<dwr> g = b(dwr::new);

   @Override
   public MapCodec<dwr> a() {
      return g;
   }

   public dwr(ebp.d $$0) {
      super(() -> dyq.c, $$0);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new ean($$0, $$1);
   }

   @Override
   protected axf<alr> c() {
      return axi.i.b(axi.ai);
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return azz.a(dyw.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$3 == jc.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
