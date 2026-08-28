import java.util.BitSet;
import javax.annotation.Nullable;

public class ada implements yw<abl> {
   public static final yn<vl, ada> a = yw.a(ada::a, ada::new);
   private final int b;
   private final int c;
   private final adb d;

   public ada(dgg $$0, etl $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adb($$0, $$1, $$2, $$3);
   }

   private ada(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adb($$0, this.b, this.c);
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public yy<ada> a() {
      return agd.M;
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

   public adb f() {
      return this.d;
   }
}
