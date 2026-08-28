import java.util.Objects;
import javax.annotation.Nullable;

public class awl<T> extends faa {
   public static final zb<wo, awl<?>> a = yz.a(lv.am).b(awl::a, awn::a);
   private final awm o;
   private final T p;
   private final awn<T> q;

   protected awl(awn<T> $$0, T $$1, awm $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awn<T> $$0, T $$1) {
      return a(lu.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable alc $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awn<T> a() {
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
      return this == $$0 || $$0 instanceof awl && Objects.equals(this.d(), ((awl)$$0).d());
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
