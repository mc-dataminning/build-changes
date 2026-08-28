import java.util.function.Predicate;

public class dbe {
   private final evp a;
   private final evp b;
   private final Predicate<dsa> c;

   public dbe(evp $$0, evp $$1, Predicate<dsa> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public evp a() {
      return this.b;
   }

   public evp b() {
      return this.a;
   }

   public Predicate<dsa> c() {
      return this.c;
   }
}
