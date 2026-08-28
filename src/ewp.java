import com.google.common.collect.UnmodifiableIterator;

public class ewp {
   public static final ewn a = a("empty", new ewl());
   public static final ewm b = a("flowing_water", new ewu.a());
   public static final ewm c = a("water", new ewu.b());
   public static final ewm d = a("flowing_lava", new ewr.a());
   public static final ewm e = a("lava", new ewr.b());

   private static <T extends ewn> T a(String $$0, T $$1) {
      return jr.a(mf.c, $$0, $$1);
   }

   static {
      for (ewn $$0 : mf.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ewo $$1 = (ewo)var2.next();
            ewn.c.b($$1);
         }
      }
   }
}
