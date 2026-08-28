import java.util.BitSet;
import javax.annotation.Nullable;

public class adx implements zw<aci> {
   public static final zn<wm, adx> a = zw.a(adx::a, adx::new);
   private final int b;
   private final int c;
   private final ady d;

   public adx(dbf $$0, enk $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new ady($$0, $$1, $$2, $$3);
   }

   private adx(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new ady($$0, this.b, this.c);
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zy<adx> a() {
      return agu.N;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ady f() {
      return this.d;
   }
}
