import java.util.Objects;
import javax.annotation.Nullable;

public class aww<T> extends fgy {
   public static final yy<wl, aww<?>> a = yw.a(mh.ar).b(aww::a, awy::a);
   private final awx p;
   private final T q;
   private final awy<T> r;

   protected aww(awy<T> $$0, T $$1, awx $$2) {
      super(a($$0, $$1));
      this.r = $$0;
      this.p = $$2;
      this.q = $$1;
   }

   public static <T> String a(awy<T> $$0, T $$1) {
      return a(mg.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ali $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awy<T> a() {
      return this.r;
   }

   public T b() {
      return this.q;
   }

   public String a(int $$0) {
      return this.p.format($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aww && Objects.equals(this.d(), ((aww)$$0).d());
   }

   @Override
   public int hashCode() {
      return this.d().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.d() + ", formatter=" + this.p + "}";
   }
}
