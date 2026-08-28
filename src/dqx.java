import com.mojang.serialization.MapCodec;

public class dqx extends dls {
   public static final MapCodec<dqx> c = b(dqx::new);
   public static final fah g = die.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dqx> a() {
      return c;
   }

   public dqx(dvi.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(azs $$0) {
      return dnj.a($$0);
   }

   @Override
   protected die b() {
      return dig.oC;
   }

   @Override
   protected boolean h(dvj $$0) {
      return dnj.a($$0);
   }
}
