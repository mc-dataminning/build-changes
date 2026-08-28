import com.google.common.collect.UnmodifiableIterator;

public class exr {
   public static final exp a = a("empty", new exn());
   public static final exo b = a("flowing_water", new exw.a());
   public static final exo c = a("water", new exw.b());
   public static final exo d = a("flowing_lava", new ext.a());
   public static final exo e = a("lava", new ext.b());

   private static <T extends exp> T a(String $$0, T $$1) {
      return jt.a(mh.c, $$0, $$1);
   }

   static {
      for (exp $$0 : mh.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            exq $$1 = (exq)var2.next();
            exp.c.b($$1);
         }
      }
   }
}
