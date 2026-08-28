import java.util.BitSet;
import javax.annotation.Nullable;

public class adm implements zl<aca> {
   public static final zc<wp, adm> a = zl.a(adm::a, adm::new);
   private final int b;
   private final int c;
   private final adl d;
   private final adq e;

   public adm(dwy $$0, eqi $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      ddp $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adl($$0);
      this.e = new adq($$4, $$1, $$2, $$3);
   }

   private adm(wp $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adl($$0, this.b, this.c);
      this.e = new adq($$0, this.b, this.c);
   }

   private void a(wp $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zn<adm> a() {
      return agp.K;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adl f() {
      return this.d;
   }

   public adq g() {
      return this.e;
   }
}
