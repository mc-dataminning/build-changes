import com.mojang.serialization.MapCodec;

public record dda() implements ddb {
   public static final dda a = new dda();
   public static final MapCodec<dda> b = MapCodec.unit(a);
   public static final yw<wj, dda> c = yw.a(a);

   @Override
   public ddb.a<dda> a() {
      return ddb.a.c;
   }

   @Override
   public boolean a(djm $$0, czn $$1, bxj $$2) {
      return $$2.eB();
   }
}
