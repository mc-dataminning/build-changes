import java.security.PublicKey;

public class abh implements uo<abe> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public abh(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public abh(sf $$0) {
      this.a = $$0.e(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey c() throws aoa {
      return anz.a(this.b);
   }

   public byte[] d() {
      return this.c;
   }
}
