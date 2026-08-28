import java.util.function.Predicate;

public class dce {
   private final exc a;
   private final exc b;
   private final Predicate<dtc> c;

   public dce(exc $$0, exc $$1, Predicate<dtc> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public exc a() {
      return this.b;
   }

   public exc b() {
      return this.a;
   }

   public Predicate<dtc> c() {
      return this.c;
   }
}
