import java.util.BitSet;
import javax.annotation.Nullable;

public class ado implements zk<abz> {
   public static final zb<wa, ado> a = zk.a(ado::a, ado::new);
   private final int b;
   private final int c;
   private final adp d;

   public ado(ddm $$0, eqe $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adp($$0, $$1, $$2, $$3);
   }

   private ado(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adp($$0, this.b, this.c);
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zm<ado> a() {
      return ago.N;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adp f() {
      return this.d;
   }
}
