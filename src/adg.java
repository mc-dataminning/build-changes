import java.util.BitSet;
import javax.annotation.Nullable;

public class adg implements zf<abu> {
   public static final yw<wj, adg> a = zf.a(adg::a, adg::new);
   private final int b;
   private final int c;
   private final adf d;
   private final adk e;

   public adg(eda $$0, ewp $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dir $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new adf($$0);
      this.e = new adk($$4, $$1, $$2, $$3);
   }

   private adg(wj $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adf($$0, this.b, this.c);
      this.e = new adk($$0, this.b, this.c);
   }

   private void a(wj $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zh<adg> a() {
      return agn.K;
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
