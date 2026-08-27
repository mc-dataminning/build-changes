import java.security.PublicKey;

public class aif implements yz<aic> {
   public static final yq<vs, aif> a = yz.a(aif::a, aif::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public aif(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aif(vs $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zb<aif> a() {
      return aii.c;
   }

   public void a(aic $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws awv {
      return awu.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
