import com.google.common.collect.UnmodifiableIterator;

public class eea {
   public static final edy a = a("empty", new edw());
   public static final edx b = a("flowing_water", new eef.a());
   public static final edx c = a("water", new eef.b());
   public static final edx d = a("flowing_lava", new eec.a());
   public static final edx e = a("lava", new eec.b());

   private static <T extends edy> T a(String $$0, T $$1) {
      return ir.a(kb.c, $$0, $$1);
   }

   static {
      for (edy $$0 : kb.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            edz $$1 = (edz)var2.next();
            edy.c.b($$1);
         }
      }
   }
}
