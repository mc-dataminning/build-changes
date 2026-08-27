import com.mojang.serialization.Codec;

class dnd implements dmr {
   public static dnd a = new dnd();
   public static final Codec<dnd> e = Codec.unit(() -> a);

   private dnd() {
   }

   public boolean a(crt $$0, ht $$1) {
      return true;
   }

   @Override
   public dms<?> a() {
      return dms.l;
   }
}
