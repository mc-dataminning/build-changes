import com.mojang.serialization.MapCodec;

public record dcx() implements dcy {
   public static final dcx a = new dcx();
   public static final MapCodec<dcx> b = MapCodec.unit(a);
   public static final yw<wj, dcx> c = yw.a(a);

   @Override
   public dcy.a<dcx> a() {
      return dcy.a.c;
   }

   @Override
   public boolean a(djh $$0, czk $$1, bxj $$2) {
      return $$2.eB();
   }
}
