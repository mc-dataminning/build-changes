import java.util.BitSet;
import javax.annotation.Nullable;

public class adu implements zq<acf> {
   public static final zh<wg, adu> a = zq.a(adu::a, adu::new);
   private final int b;
   private final int c;
   private final adv d;

   public adu(des $$0, erk $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.g;
      this.c = $$0.h;
      this.d = new adv($$0, $$1, $$2, $$3);
   }

   private adu(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adv($$0, this.b, this.c);
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zs<adu> a() {
      return agu.N;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adv f() {
      return this.d;
   }
}
