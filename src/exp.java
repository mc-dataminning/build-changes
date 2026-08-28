import com.google.common.collect.UnmodifiableIterator;

public class exp {
   public static final exn a = a("empty", new exl());
   public static final exm b = a("flowing_water", new exu.a());
   public static final exm c = a("water", new exu.b());
   public static final exm d = a("flowing_lava", new exr.a());
   public static final exm e = a("lava", new exr.b());

   private static <T extends exn> T a(String $$0, T $$1) {
      return js.a(mg.c, $$0, $$1);
   }

   static {
      for (exn $$0 : mg.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            exo $$1 = (exo)var2.next();
            exn.c.b($$1);
         }
      }
   }
}
