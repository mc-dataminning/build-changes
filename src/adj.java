import java.security.PublicKey;

public class adj implements vf<adg> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public adj(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adj(sq $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws aqz {
      return aqy.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
