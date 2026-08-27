import java.util.BitSet;
import javax.annotation.Nullable;

public class acy implements zb<abm> {
   public static final ys<wf, acy> a = zb.a(acy::a, acy::new);
   private final int b;
   private final int c;
   private final acx d;
   private final adc e;

   public acy(dsn $$0, elp $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      czk $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new acx($$0);
      this.e = new adc($$4, $$1, $$2, $$3);
   }

   private acy(wf $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acx($$0, this.b, this.c);
      this.e = new adc($$0, this.b, this.c);
   }

   private void a(wf $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zd<acy> a() {
      return afx.K;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acx f() {
      return this.d;
   }

   public adc g() {
      return this.e;
   }
}
