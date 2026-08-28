import java.util.Objects;
import javax.annotation.Nullable;

public class axf<T> extends fhk {
   public static final ze<wp, axf<?>> a = zc.a(mi.ar).b(axf::a, axh::a);
   private final axg p;
   private final T q;
   private final axh<T> r;

   protected axf(axh<T> $$0, T $$1, axg $$2) {
      super(a($$0, $$1));
      this.r = $$0;
      this.p = $$2;
      this.q = $$1;
   }

   public static <T> String a(axh<T> $$0, T $$1) {
      return a(mh.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alr $$0) {
      return $$0.toString().replace(':', '.');
   }

   public axh<T> a() {
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
      return this == $$0 || $$0 instanceof axf && Objects.equals(this.d(), ((axf)$$0).d());
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
