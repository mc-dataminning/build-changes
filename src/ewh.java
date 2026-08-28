import com.google.common.collect.UnmodifiableIterator;

public class ewh {
   public static final ewf a = a("empty", new ewd());
   public static final ewe b = a("flowing_water", new ewm.a());
   public static final ewe c = a("water", new ewm.b());
   public static final ewe d = a("flowing_lava", new ewj.a());
   public static final ewe e = a("lava", new ewj.b());

   private static <T extends ewf> T a(String $$0, T $$1) {
      return jr.a(mf.c, $$0, $$1);
   }

   static {
      for (ewf $$0 : mf.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ewg $$1 = (ewg)var2.next();
            ewf.c.b($$1);
         }
      }
   }
}
