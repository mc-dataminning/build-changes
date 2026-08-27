import java.util.Objects;
import javax.annotation.Nullable;

public class ary<T> extends emz {
   private final arz n;
   private final T o;
   private final asa<T> p;

   protected ary(asa<T> $$0, T $$1, arz $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(asa<T> $$0, T $$1) {
      return a(kd.x.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable ahg $$0) {
      return $$0.toString().replace(':', '.');
   }

   public asa<T> a() {
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
      return this == $$0 || $$0 instanceof ary && Objects.equals(this.d(), ((ary)$$0).d());
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
