import com.mojang.serialization.MapCodec;

public class dno extends dii {
   public static final MapCodec<dno> c = b(dno::new);
   public static final ewf e = deu.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dno> a() {
      return c;
   }

   public dno(drw.d $$0) {
      super($$0, je.b, e, false);
   }

   @Override
   protected dij c() {
      return (dij)dew.oB;
   }
}
