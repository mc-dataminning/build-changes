import com.mojang.serialization.MapCodec;

public class dio extends deq {
   public static final MapCodec<dio> a = b(dio::new);
   private static final ety[] b = new ety[]{
      dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected czt d() {
      return csg.ug;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b[this.g($$0)];
   }
}
