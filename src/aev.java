import java.security.PublicKey;

public class aev implements wo<aes> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public aev(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aev(ty $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws asq {
      return asp.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
