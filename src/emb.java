import com.google.common.collect.UnmodifiableIterator;

public class emb {
   public static final elz a = a("empty", new elx());
   public static final ely b = a("flowing_water", new emg.a());
   public static final ely c = a("water", new emg.b());
   public static final ely d = a("flowing_lava", new emd.a());
   public static final ely e = a("lava", new emd.b());

   private static <T extends elz> T a(String $$0, T $$1) {
      return jj.a(ld.c, $$0, $$1);
   }

   static {
      for (elz $$0 : ld.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ema $$1 = (ema)var2.next();
            elz.c.b($$1);
         }
      }
   }
}
