import java.util.Objects;
import javax.annotation.Nullable;

public class awu<T> extends fgf {
   public static final yw<wj, awu<?>> a = yu.a(mh.ar).b(awu::a, aww::a);
   private final awv p;
   private final T q;
   private final aww<T> r;

   protected awu(aww<T> $$0, T $$1, awv $$2) {
      super(a($$0, $$1));
      this.r = $$0;
      this.p = $$2;
      this.q = $$1;
   }

   public static <T> String a(aww<T> $$0, T $$1) {
      return a(mg.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alg $$0) {
      return $$0.toString().replace(':', '.');
   }

   public aww<T> a() {
      return this.r;
   }

   public T b() {
      return this.q;
   }

   public String a(int $$0) {
      return this.p.format($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof awu && Objects.equals(this.d(), ((awu)$$0).d());
   }

   @Override
   public int hashCode() {
      return this.d().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.d() + ", formatter=" + this.p + "}";
   }
}
