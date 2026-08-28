import com.mojang.serialization.MapCodec;

public record czh() implements czi {
   public static final czh a = new czh();
   public static final MapCodec<czh> b = MapCodec.unit(a);
   public static final zc<wp, czh> c = zc.a(a);

   @Override
   public czi.a<czh> a() {
      return czi.a.c;
   }

   @Override
   public boolean a(dej $$0, cvs $$1, bun $$2) {
      return $$2.ex();
   }
}
