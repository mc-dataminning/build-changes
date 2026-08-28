import java.util.Objects;
import javax.annotation.Nullable;

public class awr<T> extends fap {
   public static final zf<ws, awr<?>> a = zd.a(ly.am).b(awr::a, awt::a);
   private final aws o;
   private final T p;
   private final awt<T> q;

   protected awr(awt<T> $$0, T $$1, aws $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awt<T> $$0, T $$1) {
      return a(lx.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alh $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awt<T> a() {
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
      return this == $$0 || $$0 instanceof awr && Objects.equals(this.d(), ((awr)$$0).d());
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
