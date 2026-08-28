import java.util.BitSet;
import javax.annotation.Nullable;

public class adr implements zo<acf> {
   public static final ze<wp, adr> a = zo.a(adr::a, adr::new);
   private final int b;
   private final int c;
   private final adq d;
   private final adv e;

   public adr(edx $$0, exp $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      djo $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new adq($$0);
      this.e = new adv($$4, $$1, $$2, $$3);
   }

   private adr(wp $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adq($$0, this.b, this.c);
      this.e = new adv($$0, this.b, this.c);
   }

   private void a(wp $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zq<adr> a() {
      return agy.K;
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
