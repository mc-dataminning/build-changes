import com.mojang.serialization.MapCodec;

public class doa extends diw {
   public static final MapCodec<doa> c = b(doa::new);
   public static final ewy g = dfh.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<doa> a() {
      return c;
   }

   public doa(dsj.d $$0) {
      super($$0, jf.b, g, false, 0.1);
   }

   @Override
   protected int a(ayo $$0) {
      return dkn.a($$0);
   }

   @Override
   protected dfh b() {
      return dfj.oC;
   }

   @Override
   protected boolean g(dsk $$0) {
      return dkn.a($$0);
   }
}
