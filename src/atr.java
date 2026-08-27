import java.util.Objects;
import javax.annotation.Nullable;

public class atr<T> extends eoz {
   public static final xo<vb, atr<?>> a = xm.a(kg.ag).b(atr::a, att::a);
   private final ats o;
   private final T p;
   private final att<T> q;

   protected atr(att<T> $$0, T $$1, ats $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(att<T> $$0, T $$1) {
      return a(kf.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable aiy $$0) {
      return $$0.toString().replace(':', '.');
   }

   public att<T> a() {
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
      return this == $$0 || $$0 instanceof atr && Objects.equals(this.d(), ((atr)$$0).d());
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
