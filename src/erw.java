import com.google.common.collect.UnmodifiableIterator;

public class erw {
   public static final eru a = a("empty", new ers());
   public static final ert b = a("flowing_water", new esb.a());
   public static final ert c = a("water", new esb.b());
   public static final ert d = a("flowing_lava", new ery.a());
   public static final ert e = a("lava", new ery.b());

   private static <T extends eru> T a(String $$0, T $$1) {
      return kd.a(lz.c, $$0, $$1);
   }

   static {
      for (eru $$0 : lz.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            erv $$1 = (erv)var2.next();
            eru.c.b($$1);
         }
      }
   }
}
