import java.security.PublicKey;

public class adc implements ux<acz> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public adc(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adc(si $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acz $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws aqq {
      return aqp.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
