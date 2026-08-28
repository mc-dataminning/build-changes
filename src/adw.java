import java.util.BitSet;
import javax.annotation.Nullable;

public class adw implements zs<ach> {
   public static final zj<wi, adw> a = zs.a(adw::a, adw::new);
   private final int b;
   private final int c;
   private final adx d;

   public adw(del $$0, erd $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.g;
      this.c = $$0.h;
      this.d = new adx($$0, $$1, $$2, $$3);
   }

   private adw(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adx($$0, this.b, this.c);
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zu<adw> a() {
      return agw.N;
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
