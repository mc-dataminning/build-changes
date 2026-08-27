import com.google.common.collect.UnmodifiableIterator;

public class ekt {
   public static final ekr a = a("empty", new ekp());
   public static final ekq b = a("flowing_water", new eky.a());
   public static final ekq c = a("water", new eky.b());
   public static final ekq d = a("flowing_lava", new ekv.a());
   public static final ekq e = a("lava", new ekv.b());

   private static <T extends ekr> T a(String $$0, T $$1) {
      return iy.a(kr.c, $$0, $$1);
   }

   static {
      for (ekr $$0 : kr.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eks $$1 = (eks)var2.next();
            ekr.c.b($$1);
         }
      }
   }
}
