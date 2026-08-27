import java.util.Objects;
import javax.annotation.Nullable;

public class auf<T> extends era {
   public static final xs<vf, auf<?>> a = xq.a(kj.ag).b(auf::a, auh::a);
   private final aug o;
   private final T p;
   private final auh<T> q;

   protected auf(auh<T> $$0, T $$1, aug $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(auh<T> $$0, T $$1) {
      return a(ki.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ajh $$0) {
      return $$0.toString().replace(':', '.');
   }

   public auh<T> a() {
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
      return this == $$0 || $$0 instanceof auf && Objects.equals(this.d(), ((auf)$$0).d());
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
