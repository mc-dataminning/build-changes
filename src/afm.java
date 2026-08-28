import javax.annotation.Nullable;

public class afm implements zq<acf> {
   public static final zh<wg, afm> a = zq.a(afm::a, afm::new);
   private final int b;
   private final int c;

   public afm(bul $$0, @Nullable bul $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private afm(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zs<afm> a() {
      return agu.aD;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
