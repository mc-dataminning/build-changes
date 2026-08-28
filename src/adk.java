import java.util.BitSet;
import javax.annotation.Nullable;

public class adk implements zj<aby> {
   public static final za<wn, adk> a = zj.a(adk::a, adk::new);
   private final int b;
   private final int c;
   private final adj d;
   private final ado e;

   public adk(edn $$0, exf $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dje $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new adj($$0);
      this.e = new ado($$4, $$1, $$2, $$3);
   }

   private adk(wn $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adj($$0, this.b, this.c);
      this.e = new ado($$0, this.b, this.c);
   }

   private void a(wn $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zl<adk> a() {
      return agr.K;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adj f() {
      return this.d;
   }

   public ado g() {
      return this.e;
   }
}
