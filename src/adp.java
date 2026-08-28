import java.util.BitSet;
import javax.annotation.Nullable;

public class adp implements zl<aca> {
   public static final zc<wb, adp> a = zl.a(adp::a, adp::new);
   private final int b;
   private final int c;
   private final adq d;

   public adp(ddp $$0, eqi $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adq($$0, $$1, $$2, $$3);
   }

   private adp(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adq($$0, this.b, this.c);
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zn<adp> a() {
      return agp.N;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adq f() {
      return this.d;
   }
}
