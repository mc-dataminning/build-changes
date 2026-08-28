import java.security.PublicKey;

public class ajo implements zo<ajm> {
   public static final ze<vy, ajo> a = zo.a(ajo::a, ajo::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ajo(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajo(vy $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zq<ajo> a() {
      return ajs.c;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws ayw {
      return ayv.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
