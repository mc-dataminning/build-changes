import java.util.BitSet;
import javax.annotation.Nullable;

public class acb implements yb<aam> {
   public static final xs<uu, acb> a = yb.a(acb::a, acb::new);
   private final int b;
   private final int c;
   private final acc d;

   public acb(cwg $$0, eic $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new acc($$0, $$1, $$2, $$3);
   }

   private acb(uu $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new acc($$0, this.b, this.c);
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public yd<acb> a() {
      return aex.N;
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

   public acc f() {
      return this.d;
   }
}
