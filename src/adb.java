import java.util.BitSet;
import javax.annotation.Nullable;

public class adb implements zb<abm> {
   public static final ys<vu, adb> a = zb.a(adb::a, adb::new);
   private final int b;
   private final int c;
   private final adc d;

   public adb(czk $$0, elp $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adc($$0, $$1, $$2, $$3);
   }

   private adb(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adc($$0, this.b, this.c);
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zd<adb> a() {
      return afx.N;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adc f() {
      return this.d;
   }
}
