import java.util.Objects;
import javax.annotation.Nullable;

public class ats<T> extends epg {
   public static final xo<vb, ats<?>> a = xm.a(kg.ag).b(ats::a, atu::a);
   private final att o;
   private final T p;
   private final atu<T> q;

   protected ats(atu<T> $$0, T $$1, att $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(atu<T> $$0, T $$1) {
      return a(kf.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable aiy $$0) {
      return $$0.toString().replace(':', '.');
   }

   public atu<T> a() {
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
      return this == $$0 || $$0 instanceof ats && Objects.equals(this.d(), ((ats)$$0).d());
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
