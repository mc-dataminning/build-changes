import javax.annotation.Nullable;

public class ahx implements zg<agi> {
   public static final yx<vw, ahx> a = zg.a(ahx::a, ahx::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahx(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahx(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<ahx> a() {
      return agg.bV;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   @Nullable
   public dbx a(dcw $$0) {
      bsr $$1 = $$0.a(this.b);
      return $$1 instanceof cpb ? ((cpb)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
