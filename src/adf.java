import java.util.BitSet;
import javax.annotation.Nullable;

public class adf implements ze<abq> {
   public static final yv<vx, adf> a = ze.a(adf::a, adf::new);
   private final int b;
   private final int c;
   private final adg d;

   public adf(dae $$0, emj $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adg($$0, $$1, $$2, $$3);
   }

   private adf(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adg($$0, this.b, this.c);
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zg<adf> a() {
      return agb.N;
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

   public adg f() {
      return this.d;
   }
}
