import com.google.common.collect.UnmodifiableIterator;

public class euu {
   public static final eus a = a("empty", new euq());
   public static final eur b = a("flowing_water", new euz.a());
   public static final eur c = a("water", new euz.b());
   public static final eur d = a("flowing_lava", new euw.a());
   public static final eur e = a("lava", new euw.b());

   private static <T extends eus> T a(String $$0, T $$1) {
      return kf.a(md.c, $$0, $$1);
   }

   static {
      for (eus $$0 : md.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eut $$1 = (eut)var2.next();
            eus.c.b($$1);
         }
      }
   }
}
