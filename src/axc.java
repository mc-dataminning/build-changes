import java.util.Objects;
import javax.annotation.Nullable;

public class axc<T> extends fcz {
   public static final zi<wv, axc<?>> a = zg.a(mb.am).b(axc::a, axe::a);
   private final axd o;
   private final T p;
   private final axe<T> q;

   protected axc(axe<T> $$0, T $$1, axd $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(axe<T> $$0, T $$1) {
      return a(ma.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alp $$0) {
      return $$0.toString().replace(':', '.');
   }

   public axe<T> a() {
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
      return this == $$0 || $$0 instanceof axc && Objects.equals(this.d(), ((axc)$$0).d());
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
