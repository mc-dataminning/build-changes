import java.util.Objects;
import javax.annotation.Nullable;

public class aws<T> extends ffe {
   public static final yu<wh, aws<?>> a = ys.a(mg.ar).b(aws::a, awu::a);
   private final awt o;
   private final T p;
   private final awu<T> q;

   protected aws(awu<T> $$0, T $$1, awt $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awu<T> $$0, T $$1) {
      return a(mf.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ale $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awu<T> a() {
      return this.q;
   }

   public T b() {
      return this.p;
   }

   public String a(int $$0) {
      return this.o.format($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aws && Objects.equals(this.d(), ((aws)$$0).d());
   }

   @Override
   public int hashCode() {
      return this.d().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.d() + ", formatter=" + this.o + "}";
   }
}
