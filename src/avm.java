import java.util.Objects;
import javax.annotation.Nullable;

public class avm<T> extends exg {
   public static final ys<wf, avm<?>> a = yq.a(lr.al).b(avm::a, avo::a);
   private final avn o;
   private final T p;
   private final avo<T> q;

   protected avm(avo<T> $$0, T $$1, avn $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(avo<T> $$0, T $$1) {
      return a(lq.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable akk $$0) {
      return $$0.toString().replace(':', '.');
   }

   public avo<T> a() {
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
      return this == $$0 || $$0 instanceof avm && Objects.equals(this.d(), ((avm)$$0).d());
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
