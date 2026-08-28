import java.util.Objects;
import javax.annotation.Nullable;

public class awn<T> extends fae {
   public static final zc<wp, awn<?>> a = za.a(lw.am).b(awn::a, awp::a);
   private final awo o;
   private final T p;
   private final awp<T> q;

   protected awn(awp<T> $$0, T $$1, awo $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awp<T> $$0, T $$1) {
      return a(lv.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ale $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awp<T> a() {
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
      return this == $$0 || $$0 instanceof awn && Objects.equals(this.d(), ((awn)$$0).d());
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
