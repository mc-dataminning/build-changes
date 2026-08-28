import com.google.common.collect.UnmodifiableIterator;

public class exb {
   public static final ewz a = a("empty", new ewx());
   public static final ewy b = a("flowing_water", new exg.a());
   public static final ewy c = a("water", new exg.b());
   public static final ewy d = a("flowing_lava", new exd.a());
   public static final ewy e = a("lava", new exd.b());

   private static <T extends ewz> T a(String $$0, T $$1) {
      return js.a(mg.c, $$0, $$1);
   }

   static {
      for (ewz $$0 : mg.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            exa $$1 = (exa)var2.next();
            ewz.c.b($$1);
         }
      }
   }
}
