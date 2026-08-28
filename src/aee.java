import java.util.BitSet;
import javax.annotation.Nullable;

public class aee implements aac<acr> {
   public static final zt<xg, aee> a = aac.a(aee::a, aee::new);
   private final int b;
   private final int c;
   private final aed d;
   private final aei e;

   public aee(dzz $$0, etl $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dgn $$4 = $$0.f();
      this.b = $$4.g;
      this.c = $$4.h;
      this.d = new aed($$0);
      this.e = new aei($$4, $$1, $$2, $$3);
   }

   private aee(xg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new aed($$0, this.b, this.c);
      this.e = new aei($$0, this.b, this.c);
   }

   private void a(xg $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public aae<aee> a() {
      return ahk.K;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aed f() {
      return this.d;
   }

   public aei g() {
      return this.e;
   }
}
