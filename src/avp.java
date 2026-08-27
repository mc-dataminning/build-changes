import java.util.Objects;
import javax.annotation.Nullable;

public class avp<T> extends evt {
   public static final yv<wi, avp<?>> a = yt.a(lf.ah).b(avp::a, avr::a);
   private final avq o;
   private final T p;
   private final avr<T> q;

   protected avp(avr<T> $$0, T $$1, avq $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(avr<T> $$0, T $$1) {
      return a(le.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable akn $$0) {
      return $$0.toString().replace(':', '.');
   }

   public avr<T> a() {
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
      return this == $$0 || $$0 instanceof avp && Objects.equals(this.d(), ((avp)$$0).d());
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
