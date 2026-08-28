import java.util.BitSet;
import javax.annotation.Nullable;

public class adb implements yw<abl> {
   public static final yn<vl, adb> a = yw.a(adb::a, adb::new);
   private final int b;
   private final int c;
   private final adc d;

   public adb(dfo $$0, eso $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adc($$0, $$1, $$2, $$3);
   }

   private adb(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adc($$0, this.b, this.c);
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public yy<adb> a() {
      return age.N;
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

   public adc f() {
      return this.d;
   }
}
