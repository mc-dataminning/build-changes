import java.util.BitSet;
import javax.annotation.Nullable;

public class adr implements zq<acf> {
   public static final zh<wu, adr> a = zq.a(adr::a, adr::new);
   private final int b;
   private final int c;
   private final adq d;
   private final adv e;

   public adr(dya $$0, erk $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      des $$4 = $$0.f();
      this.b = $$4.g;
      this.c = $$4.h;
      this.d = new adq($$0);
      this.e = new adv($$4, $$1, $$2, $$3);
   }

   private adr(wu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adq($$0, this.b, this.c);
      this.e = new adv($$0, this.b, this.c);
   }

   private void a(wu $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zs<adr> a() {
      return agu.K;
   }

   public void a(acf $$0) {
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

   public adv g() {
      return this.e;
   }
}
