import com.mojang.serialization.MapCodec;

public class dgl extends dcv {
   public static final MapCodec<dgl> d = b(dgl::new);

   @Override
   protected MapCodec<? extends dgl> a() {
      return d;
   }

   protected dgl(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpy $$0, dpy $$1, ir $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
