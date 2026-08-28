import java.util.BitSet;
import javax.annotation.Nullable;

public class adw implements zv<ach> {
   public static final zm<wl, adw> a = zv.a(adw::a, adw::new);
   private final int b;
   private final int c;
   private final adx d;

   public adw(dbd $$0, eni $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adx($$0, $$1, $$2, $$3);
   }

   private adw(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adx($$0, this.b, this.c);
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zx<adw> a() {
      return agt.N;
   }

   public void a(ach $$0) {
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
