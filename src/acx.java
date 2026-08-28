import java.util.BitSet;
import javax.annotation.Nullable;

public class acx implements yw<abl> {
   public static final yn<wa, acx> a = yw.a(acx::a, acx::new);
   private final int b;
   private final int c;
   private final acw d;
   private final adb e;

   public acx(dzw $$0, etl $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dgg $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new acw($$0);
      this.e = new adb($$4, $$1, $$2, $$3);
   }

   private acx(wa $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acw($$0, this.b, this.c);
      this.e = new adb($$0, this.b, this.c);
   }

   private void a(wa $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public yy<acx> a() {
      return agd.J;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acw f() {
      return this.d;
   }

   public adb g() {
      return this.e;
   }
}
