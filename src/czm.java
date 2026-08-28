import com.mojang.serialization.MapCodec;

public record czm() implements czn {
   public static final czm a = new czm();
   public static final MapCodec<czm> b = MapCodec.unit(a);
   public static final zg<wt, czm> c = zg.a(a);

   @Override
   public czn.a<czm> a() {
      return czn.a.c;
   }

   @Override
   public boolean a(dfb $$0, cwb $$1, bva $$2) {
      return $$2.eC();
   }
}
