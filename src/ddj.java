import com.mojang.serialization.MapCodec;

public class ddj extends cvm {
   public static final MapCodec<ddj> c = b(ddj::new);

   @Override
   public MapCodec<ddj> a() {
      return c;
   }

   public ddj(dio.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cwb.a.o();
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dip $$0) {
      return $$0.a(arr.aS);
   }

   @Override
   protected boolean f(dip $$0) {
      return true;
   }
}
