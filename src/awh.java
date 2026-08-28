import java.util.Objects;
import javax.annotation.Nullable;

public class awh<T> extends exa {
   public static final zn<xa, awh<?>> a = zl.a(lq.ah).b(awh::a, awj::a);
   private final awi o;
   private final T p;
   private final awj<T> q;

   protected awh(awj<T> $$0, T $$1, awi $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awj<T> $$0, T $$1) {
      return a(lp.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alf $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awj<T> a() {
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
      return this == $$0 || $$0 instanceof awh && Objects.equals(this.d(), ((awh)$$0).d());
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
