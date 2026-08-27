import com.mojang.serialization.MapCodec;

class dyo implements dyc {
   public static dyo a = new dyo();
   public static final MapCodec<dyo> e = MapCodec.unit(() -> a);

   private dyo() {
   }

   public boolean a(dbu $$0, io $$1) {
      return true;
   }

   @Override
   public dyd<?> a() {
      return dyd.l;
   }
}
