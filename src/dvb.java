import com.mojang.serialization.MapCodec;

public class dvb extends dov implements dmp {
   public static final MapCodec<dvb> c = b(dvb::new);

   @Override
   public MapCodec<dvb> a() {
      return c;
   }

   public dvb(ean.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      a($$0, $$2, new czk(this));
   }
}
