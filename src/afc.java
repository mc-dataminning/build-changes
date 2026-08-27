import java.security.PublicKey;

public class afc implements wu<aez> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public afc(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public afc(ue $$0) {
      this.a = $$0.d(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey d() throws asx {
      return asw.a(this.b);
   }

   public byte[] e() {
      return this.c;
   }
}
