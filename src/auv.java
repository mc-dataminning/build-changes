import java.util.Objects;
import javax.annotation.Nullable;

public class auv<T> extends etq {
   public static final yg<vt, auv<?>> a = ye.a(ku.ah).b(auv::a, auy::a);
   private final auw o;
   private final T p;
   private final auy<T> q;

   protected auv(auy<T> $$0, T $$1, auw $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(auy<T> $$0, T $$1) {
      return a(kt.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ajv $$0) {
      return $$0.toString().replace(':', '.');
   }

   public auy<T> a() {
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
      return this == $$0 || $$0 instanceof auv && Objects.equals(this.d(), ((auv)$$0).d());
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
