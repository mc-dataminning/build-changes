import com.mojang.serialization.MapCodec;

public class drs extends dls {
   public static final MapCodec<drs> c = b(drs::new);
   protected static final fah g = die.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<drs> a() {
      return c;
   }

   public drs(dvi.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(azs $$0) {
      return dnj.a($$0);
   }

   @Override
   protected die b() {
      return dig.oA;
   }

   @Override
   protected boolean h(dvj $$0) {
      return dnj.a($$0);
   }
}
