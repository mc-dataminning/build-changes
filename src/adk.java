public class adk implements yw<abl> {
   public static final yn<vl, adk> a = yw.a(adk::a, adk::new);
   private final ji b;
   private final boolean c;

   public adk(ji $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adk(vl $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<adk> a() {
      return agd.X;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
