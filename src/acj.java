public class acj implements zo<acd> {
   public static final zf<we, acj> a = zo.a(acj::a, acj::new);
   private final int b;
   private final jg c;
   private final int d;

   public acj(int $$0, jg $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acj(we $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zq<acj> a() {
      return ags.h;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jg e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
