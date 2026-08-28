import java.util.Objects;
import javax.annotation.Nullable;

public class awg<T> extends ewx {
   public static final zm<wz, awg<?>> a = zk.a(lq.ah).b(awg::a, awi::a);
   private final awh o;
   private final T p;
   private final awi<T> q;

   protected awg(awi<T> $$0, T $$1, awh $$2) {
      super(a($$0, $$1));
      this.q = $$0;
      this.o = $$2;
      this.p = $$1;
   }

   public static <T> String a(awi<T> $$0, T $$1) {
      return a(lp.x.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ale $$0) {
      return $$0.toString().replace(':', '.');
   }

   public awi<T> a() {
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
      return this == $$0 || $$0 instanceof awg && Objects.equals(this.d(), ((awg)$$0).d());
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
