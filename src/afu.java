public class afu implements xz<aev> {
   public static final xq<us, afu> a = xz.a(afu::a, afu::new);
   private final boolean b;
   private final boolean c;

   public afu(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afu(us $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   @Override
   public yb<afu> a() {
      return aet.bE;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
