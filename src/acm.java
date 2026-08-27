import java.util.BitSet;
import javax.annotation.Nullable;

public class acm implements yp<aba> {
   public static final yg<vt, acm> a = yp.a(acm::a, acm::new);
   private final int b;
   private final int c;
   private final acl d;
   private final acq e;

   public acm(dro $$0, ekq $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cyn $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new acl($$0);
      this.e = new acq($$4, $$1, $$2, $$3);
   }

   private acm(vt $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acl($$0, this.b, this.c);
      this.e = new acq($$0, this.b, this.c);
   }

   private void a(vt $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public yr<acm> a() {
      return afl.K;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acl f() {
      return this.d;
   }

   public acq g() {
      return this.e;
   }
}
