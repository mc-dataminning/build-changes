import com.google.common.collect.UnmodifiableIterator;

public class eww {
   public static final ewu a = a("empty", new ews());
   public static final ewt b = a("flowing_water", new exb.a());
   public static final ewt c = a("water", new exb.b());
   public static final ewt d = a("flowing_lava", new ewy.a());
   public static final ewt e = a("lava", new ewy.b());

   private static <T extends ewu> T a(String $$0, T $$1) {
      return js.a(mg.c, $$0, $$1);
   }

   static {
      for (ewu $$0 : mg.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ewv $$1 = (ewv)var2.next();
            ewu.c.b($$1);
         }
      }
   }
}
