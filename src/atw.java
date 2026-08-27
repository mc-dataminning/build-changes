import java.util.Objects;
import javax.annotation.Nullable;

public class atw<T> extends eqc {
   public static final xq<vd, atw<?>> a = xo.a(ki.ag).b(atw::a, aty::a);
   private final atx o;
   private final T p;
   private final aty<T> q;

   protected atw(aty<T> $$0, T $$1, atx $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(aty<T> $$0, T $$1) {
      return a(kh.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ajc $$0) {
      return $$0.toString().replace(':', '.');
   }

   public aty<T> a() {
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
      return this == $$0 || $$0 instanceof atw && Objects.equals(this.d(), ((atw)$$0).d());
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
