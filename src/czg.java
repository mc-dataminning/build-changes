import com.mojang.serialization.MapCodec;

public record czg() implements czh {
   public static final czg a = new czg();
   public static final MapCodec<czg> b = MapCodec.unit(a);
   public static final zf<ws, czg> c = zf.a(a);

   @Override
   public czh.a<czg> a() {
      return czh.a.c;
   }

   @Override
   public boolean a(dev $$0, cvx $$1, buv $$2) {
      return $$2.eC();
   }
}
