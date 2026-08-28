import com.mojang.serialization.MapCodec;

public record czq() implements czr {
   public static final czq a = new czq();
   public static final MapCodec<czq> b = MapCodec.unit(a);
   public static final zj<ww, czq> c = zj.a(a);

   @Override
   public czr.a<czq> a() {
      return czr.a.c;
   }

   @Override
   public boolean a(dff $$0, cwf $$1, bve $$2) {
      return $$2.eD();
   }
}
