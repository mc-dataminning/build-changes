import com.google.common.collect.UnmodifiableIterator;

public class erp {
   public static final ern a = a("empty", new erl());
   public static final erm b = a("flowing_water", new eru.a());
   public static final erm c = a("water", new eru.b());
   public static final erm d = a("flowing_lava", new err.a());
   public static final erm e = a("lava", new err.b());

   private static <T extends ern> T a(String $$0, T $$1) {
      return kd.a(lz.c, $$0, $$1);
   }

   static {
      for (ern $$0 : lz.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ero $$1 = (ero)var2.next();
            ern.c.b($$1);
         }
      }
   }
}
