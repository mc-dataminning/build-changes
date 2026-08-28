import java.util.Objects;
import javax.annotation.Nullable;

public class avo<T> extends exm {
   public static final ys<wf, avo<?>> a = yq.a(lr.al).b(avo::a, avq::a);
   private final avp o;
   private final T p;
   private final avq<T> q;

   protected avo(avq<T> $$0, T $$1, avp $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(avq<T> $$0, T $$1) {
      return a(lq.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable akk $$0) {
      return $$0.toString().replace(':', '.');
   }

   public avq<T> a() {
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
      return this == $$0 || $$0 instanceof avo && Objects.equals(this.d(), ((avo)$$0).d());
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
