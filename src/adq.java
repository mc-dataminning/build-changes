import java.util.BitSet;
import javax.annotation.Nullable;

public class adq implements zs<ace> {
   public static final zj<ww, adq> a = zs.a(adq::a, adq::new);
   private final int b;
   private final int c;
   private final adp d;
   private final adu e;

   public adq(dud $$0, enf $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dba $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adp($$0);
      this.e = new adu($$4, $$1, $$2, $$3);
   }

   private adq(ww $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adp($$0, this.b, this.c);
      this.e = new adu($$0, this.b, this.c);
   }

   private void a(ww $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zu<adq> a() {
      return agq.K;
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
