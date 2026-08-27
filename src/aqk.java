import java.util.Objects;
import javax.annotation.Nullable;

public class aqk<T> extends ejh {
   private final aql n;
   private final T o;
   private final aqm<T> p;

   protected aqk(aqm<T> $$0, T $$1, aql $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(aqm<T> $$0, T $$1) {
      return a(jy.y.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable afw $$0) {
      return $$0.toString().replace(':', '.');
   }

   public aqm<T> a() {
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
      return this == $$0 || $$0 instanceof aqk && Objects.equals(this.d(), ((aqk)$$0).d());
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
