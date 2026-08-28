import java.util.BitSet;
import javax.annotation.Nullable;

public class adc implements zb<abn> {
   public static final ys<vr, adc> a = zb.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final add d;

   public adc(dbm $$0, enw $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new add($$0, $$1, $$2, $$3);
   }

   private adc(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new add($$0, this.b, this.c);
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zd<adc> a() {
      return afz.N;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public add f() {
      return this.d;
   }
}
