public class aec implements zo<acd> {
   public static final zf<we, aec> a = zo.a(aec::a, aec::new);
   private final jg b;
   private final boolean c;

   public aec(jg $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aec(we $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<aec> a() {
      return ags.Y;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public jg b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
