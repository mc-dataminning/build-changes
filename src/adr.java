public class adr implements zd<abs> {
   public static final yu<vs, adr> a = zd.a(adr::a, adr::new);
   private final iu b;
   private final boolean c;

   public adr(iu $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adr(vs $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<adr> a() {
      return agl.Y;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
