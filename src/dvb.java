import com.mojang.serialization.MapCodec;

public class dvb extends dvg {
   public static final MapCodec<dvb> a = b(dvb::new);

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   public dvb(eag.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(eah $$0) {
      return false;
   }

   @Override
   protected int i_(eah $$0) {
      return 15;
   }
}
