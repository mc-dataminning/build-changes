import java.util.Objects;
import javax.annotation.Nullable;

public class awu<T> extends fbg {
   public static final zh<wu, awu<?>> a = zf.a(ma.am).b(awu::a, aww::a);
   private final awv o;
   private final T p;
   private final aww<T> q;

   protected awu(aww<T> $$0, T $$1, awv $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(aww<T> $$0, T $$1) {
      return a(lz.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alj $$0) {
      return $$0.toString().replace(':', '.');
   }

   public aww<T> a() {
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
      return this == $$0 || $$0 instanceof awu && Objects.equals(this.d(), ((awu)$$0).d());
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
