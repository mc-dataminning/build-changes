import com.mojang.serialization.MapCodec;

public record ddn() implements ddo {
   public static final ddn a = new ddn();
   public static final MapCodec<ddn> b = MapCodec.unit(a);
   public static final za<wn, ddn> c = za.a(a);

   @Override
   public ddo.a<ddn> a() {
      return ddo.a.c;
   }

   @Override
   public boolean a(djz $$0, daa $$1, bxw $$2) {
      return $$2.eC();
   }
}
