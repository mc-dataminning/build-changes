import java.security.PublicKey;

public class aer implements wk<aeo> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public aer(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aer(tu $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aeo $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws asm {
      return asl.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
