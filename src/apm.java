import java.util.Objects;
import javax.annotation.Nullable;

public class apm<T> extends eir {
   private final apn n;
   private final T o;
   private final apo<T> p;

   protected apm(apo<T> $$0, T $$1, apn $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(apo<T> $$0, T $$1) {
      return a(jd.y.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable aey $$0) {
      return $$0.toString().replace(':', '.');
   }

   public apo<T> a() {
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
      return this == $$0 || $$0 instanceof apm && Objects.equals(this.d(), ((apm)$$0).d());
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
