import java.util.BitSet;
import javax.annotation.Nullable;

public class adc implements ze<abq> {
   public static final yv<wi, adc> a = ze.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final adb d;
   private final adg e;

   public adc(dth $$0, emj $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dae $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adb($$0);
      this.e = new adg($$4, $$1, $$2, $$3);
   }

   private adc(wi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adb($$0, this.b, this.c);
      this.e = new adg($$0, this.b, this.c);
   }

   private void a(wi $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zg<adc> a() {
      return agb.K;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adb f() {
      return this.d;
   }

   public adg g() {
      return this.e;
   }
}
