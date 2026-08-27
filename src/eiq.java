import com.google.common.collect.UnmodifiableIterator;

public class eiq {
   public static final eio a = a("empty", new eim());
   public static final ein b = a("flowing_water", new eiv.a());
   public static final ein c = a("water", new eiv.b());
   public static final ein d = a("flowing_lava", new eis.a());
   public static final ein e = a("lava", new eis.b());

   private static <T extends eio> T a(String $$0, T $$1) {
      return iy.a(ki.c, $$0, $$1);
   }

   static {
      for (eio $$0 : ki.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eip $$1 = (eip)var2.next();
            eio.c.b($$1);
         }
      }
   }
}
