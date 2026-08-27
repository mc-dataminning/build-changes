import java.security.PublicKey;

public class ahv implements yp<ahs> {
   public static final yg<vi, ahv> a = yp.a(ahv::a, ahv::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ahv(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ahv(vi $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public yr<ahv> a() {
      return ahy.c;
   }

   public void a(ahs $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws awl {
      return awk.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
