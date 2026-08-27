import javax.annotation.Nullable;

public class aev implements ze<abq> {
   public static final yv<vx, aev> a = ze.a(aev::a, aev::new);
   private final int b;
   private final int c;

   public aev(bru $$0, @Nullable bru $$1) {
      this.b = $$0.al();
      this.c = $$1 != null ? $$1.al() : 0;
   }

   private aev(vx $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vx $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zg<aev> a() {
      return agb.aD;
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
}
