import com.mojang.serialization.MapCodec;

public class dcq extends cxn {
   public static final MapCodec<dcq> c = b(dcq::new);
   public static final eiy e = cua.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dcq> a() {
      return c;
   }

   public dcq(dga.d $$0) {
      super($$0, hx.b, e, false);
   }

   @Override
   protected cxo c() {
      return (cxo)cuc.oB;
   }
}
