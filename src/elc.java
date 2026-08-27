import com.google.common.collect.UnmodifiableIterator;

public class elc {
   public static final ela a = a("empty", new eky());
   public static final ekz b = a("flowing_water", new elh.a());
   public static final ekz c = a("water", new elh.b());
   public static final ekz d = a("flowing_lava", new ele.a());
   public static final ekz e = a("lava", new ele.b());

   private static <T extends ela> T a(String $$0, T $$1) {
      return ja.a(kt.c, $$0, $$1);
   }

   static {
      for (ela $$0 : kt.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            elb $$1 = (elb)var2.next();
            ela.c.b($$1);
         }
      }
   }
}
