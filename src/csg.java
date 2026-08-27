import java.util.function.Predicate;

public class csg {
   private final elb a;
   private final elb b;
   private final Predicate<dip> c;

   public csg(elb $$0, elb $$1, Predicate<dip> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public elb a() {
      return this.b;
   }

   public elb b() {
      return this.a;
   }

   public Predicate<dip> c() {
      return this.c;
   }
}
