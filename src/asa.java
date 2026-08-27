import java.util.Objects;
import javax.annotation.Nullable;

public class asa<T> extends enj {
   private final asb n;
   private final T o;
   private final asc<T> p;

   protected asa(asc<T> $$0, T $$1, asb $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(asc<T> $$0, T $$1) {
      return a(kd.x.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable ahh $$0) {
      return $$0.toString().replace(':', '.');
   }

   public asc<T> a() {
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
      return this == $$0 || $$0 instanceof asa && Objects.equals(this.d(), ((asa)$$0).d());
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
