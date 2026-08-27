import java.util.BitSet;
import javax.annotation.Nullable;

public class acp implements yp<aba> {
   public static final yg<vi, acp> a = yp.a(acp::a, acp::new);
   private final int b;
   private final int c;
   private final acq d;

   public acp(cyn $$0, ekq $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new acq($$0, $$1, $$2, $$3);
   }

   private acp(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new acq($$0, this.b, this.c);
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public yr<acp> a() {
      return afl.N;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acq f() {
      return this.d;
   }
}
