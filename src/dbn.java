import java.util.function.Predicate;

public class dbn {
   private final ewf a;
   private final ewf b;
   private final Predicate<dsk> c;

   public dbn(ewf $$0, ewf $$1, Predicate<dsk> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ewf a() {
      return this.b;
   }

   public ewf b() {
      return this.a;
   }

   public Predicate<dsk> c() {
      return this.c;
   }
}
