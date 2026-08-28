import javax.annotation.Nullable;

public class aev implements yv<abk> {
   public static final ym<vl, aev> a = yv.a(aev::a, aev::new);
   private final int b;
   private final int c;

   public aev(buj $$0, @Nullable buj $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private aev(vl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vl $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public yx<aev> a() {
      return agd.aG;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
