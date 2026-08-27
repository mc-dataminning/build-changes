import java.util.BitSet;
import javax.annotation.Nullable;

public class acw implements yz<abk> {
   public static final yq<wd, acw> a = yz.a(acw::a, acw::new);
   private final int b;
   private final int c;
   private final acv d;
   private final ada e;

   public acw(dse $$0, elg $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      czb $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new acv($$0);
      this.e = new ada($$4, $$1, $$2, $$3);
   }

   private acw(wd $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acv($$0, this.b, this.c);
      this.e = new ada($$0, this.b, this.c);
   }

   private void a(wd $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zb<acw> a() {
      return afv.K;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acv f() {
      return this.d;
   }

   public ada g() {
      return this.e;
   }
}
