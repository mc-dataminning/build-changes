import java.util.Objects;
import javax.annotation.Nullable;

public class axm<T> extends fdf {
   public static final zt<xg, axm<?>> a = zr.a(mb.am).b(axm::a, axo::a);
   private final axn o;
   private final T p;
   private final axo<T> q;

   protected axm(axo<T> $$0, T $$1, axn $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(axo<T> $$0, T $$1) {
      return a(ma.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alz $$0) {
      return $$0.toString().replace(':', '.');
   }

   public axo<T> a() {
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
      return this == $$0 || $$0 instanceof axm && Objects.equals(this.d(), ((axm)$$0).d());
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
