import com.mojang.serialization.MapCodec;

public class doj extends dii {
   public static final MapCodec<doj> c = b(doj::new);
   public static final ewf e = deu.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<doj> a() {
      return c;
   }

   public doj(drw.d $$0) {
      super($$0, je.a, e, false);
   }

   @Override
   protected dij c() {
      return (dij)dew.oz;
   }
}
