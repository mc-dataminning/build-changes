import com.mojang.serialization.MapCodec;

public record daz() implements dba {
   public static final daz a = new daz();
   public static final MapCodec<daz> b = MapCodec.unit(a);
   public static final zt<xg, daz> c = zt.a(a);

   @Override
   public dba.a<daz> a() {
      return dba.a.c;
   }

   @Override
   public boolean a(dhh $$0, cxo $$1, bwf $$2) {
      return $$2.eA();
   }
}
