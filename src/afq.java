import java.security.PublicKey;

public class afq implements xg<afn> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public afq(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public afq(uj $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws ato {
      return atn.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
