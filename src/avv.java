import java.util.Objects;
import javax.annotation.Nullable;

public class avv<T> extends eyd {
   public static final yw<wj, avv<?>> a = yu.a(lu.am).b(avv::a, avx::a);
   private final avw o;
   private final T p;
   private final avx<T> q;

   protected avv(avx<T> $$0, T $$1, avw $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(avx<T> $$0, T $$1) {
      return a(lt.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable akq $$0) {
      return $$0.toString().replace(':', '.');
   }

   public avx<T> a() {
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
      return this == $$0 || $$0 instanceof avv && Objects.equals(this.d(), ((avv)$$0).d());
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
