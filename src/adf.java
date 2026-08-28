import java.util.BitSet;
import javax.annotation.Nullable;

public class adf implements zf<abt> {
   public static final yw<wj, adf> a = zf.a(adf::a, adf::new);
   private final int b;
   private final int c;
   private final ade d;
   private final adj e;

   public adf(dvg $$0, eon $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dcb $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new ade($$0);
      this.e = new adj($$4, $$1, $$2, $$3);
   }

   private adf(wj $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new ade($$0, this.b, this.c);
      this.e = new adj($$0, this.b, this.c);
   }

   private void a(wj $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zh<adf> a() {
      return agf.K;
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

   public ade f() {
      return this.d;
   }

   public adj g() {
      return this.e;
   }
}
