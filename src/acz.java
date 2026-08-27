import java.util.BitSet;
import javax.annotation.Nullable;

public class acz implements yz<abk> {
   public static final yq<vs, acz> a = yz.a(acz::a, acz::new);
   private final int b;
   private final int c;
   private final ada d;

   public acz(czb $$0, elg $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new ada($$0, $$1, $$2, $$3);
   }

   private acz(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new ada($$0, this.b, this.c);
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zb<acz> a() {
      return afv.N;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ada f() {
      return this.d;
   }
}
