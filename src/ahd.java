import java.security.PublicKey;

public class ahd implements xz<aha> {
   public static final xq<us, ahd> a = xz.a(ahd::a, ahd::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ahd(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ahd(us $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public yb<ahd> a() {
      return ahg.c;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws avl {
      return avk.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
