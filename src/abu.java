import java.util.BitSet;
import javax.annotation.Nullable;

public class abu implements xz<aai> {
   public static final xq<vd, abu> a = xz.a(abu::a, abu::new);
   private final int b;
   private final int c;
   private final abt d;
   private final aby e;

   public abu(dol $$0, ehg $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cvl $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new abt($$0);
      this.e = new aby($$4, $$1, $$2, $$3);
   }

   private abu(vd $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new abt($$0, this.b, this.c);
      this.e = new aby($$0, this.b, this.c);
   }

   private void a(vd $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public yb<abu> a() {
      return aet.K;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public abt f() {
      return this.d;
   }

   public aby g() {
      return this.e;
   }
}
