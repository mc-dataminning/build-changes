import java.util.BitSet;
import javax.annotation.Nullable;

public class abr implements xx<aag> {
   public static final xo<vb, abr> a = xx.a(abr::a, abr::new);
   private final int b;
   private final int c;
   private final abq d;
   private final abv e;

   public abr(dnm $$0, ege $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cuu $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new abq($$0);
      this.e = new abv($$4, $$1, $$2, $$3);
   }

   private abr(vb $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new abq($$0, this.b, this.c);
      this.e = new abv($$0, this.b, this.c);
   }

   private void a(vb $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public xz<abr> a() {
      return aeq.J;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public abq f() {
      return this.d;
   }

   public abv g() {
      return this.e;
   }
}
