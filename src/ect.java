import com.google.common.collect.UnmodifiableIterator;

public class ect {
   public static final ecr a = a("empty", new ecp());
   public static final ecq b = a("flowing_water", new ecy.a());
   public static final ecq c = a("water", new ecy.b());
   public static final ecq d = a("flowing_lava", new ecv.a());
   public static final ecq e = a("lava", new ecv.b());

   private static <T extends ecr> T a(String $$0, T $$1) {
      return io.a(jy.d, $$0, $$1);
   }

   static {
      for (ecr $$0 : jy.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ecs $$1 = (ecs)var2.next();
            ecr.c.b($$1);
         }
      }
   }
}
