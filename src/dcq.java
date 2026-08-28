import com.mojang.serialization.MapCodec;

public record dcq() implements dcr {
   public static final dcq a = new dcq();
   public static final MapCodec<dcq> b = MapCodec.unit(a);
   public static final yw<wj, dcq> c = yw.a(a);

   @Override
   public dcr.a<dcq> a() {
      return dcr.a.c;
   }

   @Override
   public boolean a(dja $$0, czd $$1, bxe $$2) {
      return $$2.eC();
   }
}
