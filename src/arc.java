import java.util.Objects;
import javax.annotation.Nullable;

public class arc<T> extends elb {
   private final ard n;
   private final T o;
   private final are<T> p;

   protected arc(are<T> $$0, T $$1, ard $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(are<T> $$0, T $$1) {
      return a(kc.y.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable agm $$0) {
      return $$0.toString().replace(':', '.');
   }

   public are<T> a() {
      return this.p;
   }

   public T b() {
      return this.o;
   }

   public String a(int $$0) {
      return this.n.format($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof arc && Objects.equals(this.d(), ((arc)$$0).d());
   }

   @Override
   public int hashCode() {
      return this.d().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.d() + ", formatter=" + this.n + "}";
   }
}
