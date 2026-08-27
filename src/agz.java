import java.security.PublicKey;

public class agz implements xx<agw> {
   public static final xo<uq, agz> a = xx.a(agz::a, agz::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public agz(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private agz(uq $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public xz<agz> a() {
      return ahc.c;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws avg {
      return avf.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
