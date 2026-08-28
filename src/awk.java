import java.util.Objects;
import javax.annotation.Nullable;

public class awk<T> extends ezl {
   public static final zb<wo, awk<?>> a = yz.a(lv.am).b(awk::a, awm::a);
   private final awl o;
   private final T p;
   private final awm<T> q;

   protected awk(awm<T> $$0, T $$1, awl $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awm<T> $$0, T $$1) {
      return a(lu.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alb $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awm<T> a() {
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
      return this == $$0 || $$0 instanceof awk && Objects.equals(this.d(), ((awk)$$0).d());
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
