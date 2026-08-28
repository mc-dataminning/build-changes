import java.util.BitSet;
import javax.annotation.Nullable;

public class adg implements zg<abu> {
   public static final yx<wk, adg> a = zg.a(adg::a, adg::new);
   private final int b;
   private final int c;
   private final adf d;
   private final adk e;

   public adg(dvi $$0, eor $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dcd $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adf($$0);
      this.e = new adk($$4, $$1, $$2, $$3);
   }

   private adg(wk $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adf($$0, this.b, this.c);
      this.e = new adk($$0, this.b, this.c);
   }

   private void a(wk $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zi<adg> a() {
      return agg.K;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adf f() {
      return this.d;
   }

   public adk g() {
      return this.e;
   }
}
