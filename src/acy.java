import java.util.BitSet;
import javax.annotation.Nullable;

public class acy implements yw<abl> {
   public static final yn<wa, acy> a = yw.a(acy::a, acy::new);
   private final int b;
   private final int c;
   private final acx d;
   private final adc e;

   public acy(dzb $$0, esn $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dfn $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new acx($$0);
      this.e = new adc($$4, $$1, $$2, $$3);
   }

   private acy(wa $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acx($$0, this.b, this.c);
      this.e = new adc($$0, this.b, this.c);
   }

   private void a(wa $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public yy<acy> a() {
      return age.K;
   }

   public void a(abl $$0) {
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
