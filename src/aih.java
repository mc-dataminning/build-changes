import javax.annotation.Nullable;

public class aih implements zs<ags> {
   public static final zj<wl, aih> a = zs.a(aih::a, aih::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aih(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aih(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<aih> a() {
      return agq.bV;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   @Nullable
   public dau a(dbt $$0) {
      bsp $$1 = $$0.a(this.b);
      return $$1 instanceof cow ? ((cow)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
