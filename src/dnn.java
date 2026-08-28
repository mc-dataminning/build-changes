import com.mojang.serialization.MapCodec;

public class dnn extends dij {
   public static final MapCodec<dnn> c = b(dnn::new);
   public static final ewf g = deu.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dnn> a() {
      return c;
   }

   public dnn(drw.d $$0) {
      super($$0, je.b, g, false, 0.1);
   }

   @Override
   protected int a(azc $$0) {
      return dka.a($$0);
   }

   @Override
   protected deu b() {
      return dew.oC;
   }

   @Override
   protected boolean g(drx $$0) {
      return dka.a($$0);
   }
}
