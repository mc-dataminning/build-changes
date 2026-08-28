import java.util.BitSet;
import javax.annotation.Nullable;

public class adi implements zf<abt> {
   public static final yw<vv, adi> a = zf.a(adi::a, adi::new);
   private final int b;
   private final int c;
   private final adj d;

   public adi(dcb $$0, eon $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adj($$0, $$1, $$2, $$3);
   }

   private adi(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adj($$0, this.b, this.c);
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zh<adi> a() {
      return agf.N;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adj f() {
      return this.d;
   }
}
