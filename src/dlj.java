import com.mojang.serialization.MapCodec;

public class dlj extends ddy {
   public static final MapCodec<dlj> n = b(dlj::new);

   @Override
   public MapCodec<dlj> a() {
      return n;
   }

   public dlj(dpx.d $$0) {
      super($$0, () -> dnf.c);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dow($$0, $$1);
   }

   @Override
   protected avg<akf> c() {
      return avj.i.b(avj.ai);
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return axw.a(dnk.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$3 == ir.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
