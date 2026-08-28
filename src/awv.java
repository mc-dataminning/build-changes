import java.util.Objects;
import javax.annotation.Nullable;

public class awv<T> extends faz {
   public static final zj<ww, awv<?>> a = zh.a(ma.am).b(awv::a, awx::a);
   private final aww o;
   private final T p;
   private final awx<T> q;

   protected awv(awx<T> $$0, T $$1, aww $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awx<T> $$0, T $$1) {
      return a(lz.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable all $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awx<T> a() {
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
      return this == $$0 || $$0 instanceof awv && Objects.equals(this.d(), ((awv)$$0).d());
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
