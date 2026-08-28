import com.mojang.serialization.MapCodec;

public class epf extends epg {
   public static final MapCodec<epf> a = MapCodec.unit(() -> epf.b);
   public static final epf b = new epf();

   private epf() {
   }

   @Override
   public boolean a(jg $$0, jg $$1, jg $$2, azr $$3) {
      return true;
   }

   @Override
   protected eph<?> a() {
      return eph.a;
   }
}
