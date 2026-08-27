import javax.annotation.Nullable;

public class aht implements ze<age> {
   public static final yv<vx, aht> a = ze.a(aht::a, aht::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aht(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aht(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<aht> a() {
      return agc.bV;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   @Nullable
   public daa a(daz $$0) {
      brw $$1 = $$0.a(this.b);
      return $$1 instanceof cob ? ((cob)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
