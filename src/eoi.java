import com.google.common.collect.UnmodifiableIterator;

public class eoi {
   public static final eog a = a("empty", new eoe());
   public static final eof b = a("flowing_water", new eon.a());
   public static final eof c = a("water", new eon.b());
   public static final eof d = a("flowing_lava", new eok.a());
   public static final eof e = a("lava", new eok.b());

   private static <T extends eog> T a(String $$0, T $$1) {
      return jw.a(lq.c, $$0, $$1);
   }

   static {
      for (eog $$0 : lq.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eoh $$1 = (eoh)var2.next();
            eog.c.b($$1);
         }
      }
   }
}
