import java.util.Objects;
import javax.annotation.Nullable;

public class awy<T> extends fha {
   public static final za<wn, awy<?>> a = yy.a(mi.ar).b(awy::a, axa::a);
   private final awz p;
   private final T q;
   private final axa<T> r;

   protected awy(axa<T> $$0, T $$1, awz $$2) {
      super(a($$0, $$1));
      this.r = $$0;
      this.p = $$2;
      this.q = $$1;
   }

   public static <T> String a(axa<T> $$0, T $$1) {
      return a(mh.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alk $$0) {
      return $$0.toString().replace(':', '.');
   }

   public axa<T> a() {
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
      return this == $$0 || $$0 instanceof awy && Objects.equals(this.d(), ((awy)$$0).d());
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
