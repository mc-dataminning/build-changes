import java.util.BitSet;
import javax.annotation.Nullable;

public class adq implements zp<ace> {
   public static final zg<wt, adq> a = zp.a(adq::a, adq::new);
   private final int b;
   private final int c;
   private final adp d;
   private final adu e;

   public adq(dxp $$0, eqz $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      deh $$4 = $$0.f();
      this.b = $$4.g;
      this.c = $$4.h;
      this.d = new adp($$0);
      this.e = new adu($$4, $$1, $$2, $$3);
   }

   private adq(wt $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adp($$0, this.b, this.c);
      this.e = new adu($$0, this.b, this.c);
   }

   private void a(wt $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zr<adq> a() {
      return agt.K;
   }

   public void a(ace $$0) {
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

   public adu g() {
      return this.e;
   }
}
