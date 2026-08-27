import com.mojang.serialization.MapCodec;

public class cxw extends cxy {
   public static final MapCodec<cxw> a = b(cxw::new);
   private static final eol b = cyo.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cxw> a() {
      return a;
   }

   protected cxw(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }
}
