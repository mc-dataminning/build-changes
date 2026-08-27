import com.mojang.serialization.MapCodec;

public class dkk extends dep implements dck {
   public static final MapCodec<dkk> c = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return c;
   }

   public dkk(dph.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      a($$0, $$2, new crs(this));
   }
}
