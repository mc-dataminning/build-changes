import java.util.BitSet;
import javax.annotation.Nullable;

public class adi implements zh<abw> {
   public static final yy<wl, adi> a = zh.a(adi::a, adi::new);
   private final int b;
   private final int c;
   private final adh d;
   private final adm e;

   public adi(edl $$0, exd $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      djc $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new adh($$0);
      this.e = new adm($$4, $$1, $$2, $$3);
   }

   private adi(wl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adh($$0, this.b, this.c);
      this.e = new adm($$0, this.b, this.c);
   }

   private void a(wl $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zj<adi> a() {
      return agp.K;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adh f() {
      return this.d;
   }

   public adm g() {
      return this.e;
   }
}
