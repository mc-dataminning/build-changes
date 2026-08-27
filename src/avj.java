import java.util.Objects;
import javax.annotation.Nullable;

public class avj<T> extends euw {
   public static final ys<wf, avj<?>> a = yq.a(le.ah).b(avj::a, avl::a);
   private final avk o;
   private final T p;
   private final avl<T> q;

   protected avj(avl<T> $$0, T $$1, avk $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(avl<T> $$0, T $$1) {
      return a(ld.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable akh $$0) {
      return $$0.toString().replace(':', '.');
   }

   public avl<T> a() {
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
      return this == $$0 || $$0 instanceof avj && Objects.equals(this.d(), ((avj)$$0).d());
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
