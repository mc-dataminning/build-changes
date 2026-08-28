import com.google.common.collect.UnmodifiableIterator;

public class eyb {
   public static final exz a = a("empty", new exx());
   public static final exy b = a("flowing_water", new eyg.a());
   public static final exy c = a("water", new eyg.b());
   public static final exy d = a("flowing_lava", new eyd.a());
   public static final exy e = a("lava", new eyd.b());

   private static <T extends exz> T a(String $$0, T $$1) {
      return jt.a(mh.c, $$0, $$1);
   }

   static {
      for (exz $$0 : mh.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eya $$1 = (eya)var2.next();
            exz.c.b($$1);
         }
      }
   }
}
