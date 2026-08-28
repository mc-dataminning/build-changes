import java.util.BitSet;
import javax.annotation.Nullable;

public class adw implements zr<acg> {
   public static final zi<wh, adw> a = zr.a(adw::a, adw::new);
   private final int b;
   private final int c;
   private final adx d;

   public adw(dgf $$0, etf $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adx($$0, $$1, $$2, $$3);
   }

   private adw(wh $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adx($$0, this.b, this.c);
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zt<adw> a() {
      return agz.N;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adx f() {
      return this.d;
   }
}
