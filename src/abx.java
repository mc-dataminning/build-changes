import java.util.BitSet;
import javax.annotation.Nullable;

public class abx implements xz<aai> {
   public static final xq<us, abx> a = xz.a(abx::a, abx::new);
   private final int b;
   private final int c;
   private final aby d;

   public abx(cvl $$0, ehg $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new aby($$0, $$1, $$2, $$3);
   }

   private abx(us $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new aby($$0, this.b, this.c);
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public yb<abx> a() {
      return aet.N;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aby f() {
      return this.d;
   }
}
