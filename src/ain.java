import javax.annotation.Nullable;

public class ain implements zq<agw> {
   public static final zh<wg, ain> a = zq.a(ain::a, ain::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ain(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ain(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zs<ain> a() {
      return agu.bY;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   @Nullable
   public dem a(dfm $$0) {
      bul $$1 = $$0.a(this.b);
      return $$1 instanceof crd ? ((crd)$$1).u() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
