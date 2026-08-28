import com.google.common.collect.UnmodifiableIterator;

public class enr {
   public static final enp a = a("empty", new enn());
   public static final eno b = a("flowing_water", new enw.a());
   public static final eno c = a("water", new enw.b());
   public static final eno d = a("flowing_lava", new ent.a());
   public static final eno e = a("lava", new ent.b());

   private static <T extends enp> T a(String $$0, T $$1) {
      return jv.a(lp.c, $$0, $$1);
   }

   static {
      for (enp $$0 : lp.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            enq $$1 = (enq)var2.next();
            enp.c.b($$1);
         }
      }
   }
}
