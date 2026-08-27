import java.security.PublicKey;

public class ahh implements yb<ahe> {
   public static final xs<uu, ahh> a = yb.a(ahh::a, ahh::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ahh(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ahh(uu $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public yd<ahh> a() {
      return ahk.c;
   }

   public void a(ahe $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws avv {
      return avu.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
