import com.mojang.serialization.MapCodec;

public record dba() implements dbb {
   public static final dba a = new dba();
   public static final MapCodec<dba> b = MapCodec.unit(a);
   public static final zt<xg, dba> c = zt.a(a);

   @Override
   public dbb.a<dba> a() {
      return dbb.a.c;
   }

   @Override
   public boolean a(dhi $$0, cxp $$1, bwg $$2) {
      return $$2.eA();
   }
}
