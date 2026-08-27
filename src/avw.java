import java.util.Objects;
import javax.annotation.Nullable;

public class avw<T> extends eyb {
   public static final zc<wp, avw<?>> a = za.a(li.ah).b(avw::a, avy::a);
   private final avx o;
   private final T p;
   private final avy<T> q;

   protected avw(avy<T> $$0, T $$1, avx $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(avy<T> $$0, T $$1) {
      return a(lh.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable akt $$0) {
      return $$0.toString().replace(':', '.');
   }

   public avy<T> a() {
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
      return this == $$0 || $$0 instanceof avw && Objects.equals(this.d(), ((avw)$$0).d());
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
