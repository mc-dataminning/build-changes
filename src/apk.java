import java.util.Objects;
import javax.annotation.Nullable;

public class apk<T> extends eip {
   private final apl n;
   private final T o;
   private final apm<T> p;

   protected apk(apm<T> $$0, T $$1, apl $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(apm<T> $$0, T $$1) {
      return a(jb.y.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable aew $$0) {
      return $$0.toString().replace(':', '.');
   }

   public apm<T> a() {
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
      return this == $$0 || $$0 instanceof apk && Objects.equals(this.d(), ((apk)$$0).d());
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
