import java.security.PublicKey;

public class adh implements vd<ade> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public adh(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adh(so $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(ade $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws aqx {
      return aqw.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
