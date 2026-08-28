public class adr implements zf<abt> {
   public static final yw<vv, adr> a = zf.a(adr::a, adr::new);
   private final jd b;
   private final boolean c;

   public adr(jd $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adr(vv $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<adr> a() {
      return agf.X;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
