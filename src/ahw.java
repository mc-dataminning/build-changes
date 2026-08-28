import javax.annotation.Nullable;

public class ahw implements zf<agh> {
   public static final yw<vv, ahw> a = zf.a(ahw::a, ahw::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahw(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahw(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<ahw> a() {
      return agf.bV;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   @Nullable
   public dbv a(dcu $$0) {
      bsq $$1 = $$0.a(this.b);
      return $$1 instanceof coz ? ((coz)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
