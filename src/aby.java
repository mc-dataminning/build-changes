import java.util.BitSet;
import javax.annotation.Nullable;

public class aby implements yb<aam> {
   public static final xs<vf, aby> a = yb.a(aby::a, aby::new);
   private final int b;
   private final int c;
   private final abx d;
   private final acc e;

   public aby(dpi $$0, eie $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cwi $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new abx($$0);
      this.e = new acc($$4, $$1, $$2, $$3);
   }

   private aby(vf $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new abx($$0, this.b, this.c);
      this.e = new acc($$0, this.b, this.c);
   }

   private void a(vf $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public yd<aby> a() {
      return aex.K;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public abx f() {
      return this.d;
   }

   public acc g() {
      return this.e;
   }
}
