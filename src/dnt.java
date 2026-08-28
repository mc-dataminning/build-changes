import com.mojang.serialization.MapCodec;

public class dnt extends din {
   public static final MapCodec<dnt> c = b(dnt::new);
   public static final ewk e = dez.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dnt> a() {
      return c;
   }

   public dnt(dsb.d $$0) {
      super($$0, je.b, e, false);
   }

   @Override
   protected dio c() {
      return (dio)dfb.oB;
   }
}
