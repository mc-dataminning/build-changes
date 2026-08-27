import java.security.PublicKey;

public class aim implements ze<aij> {
   public static final yv<vx, aim> a = ze.a(aim::a, aim::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public aim(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aim(vx $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zg<aim> a() {
      return aip.c;
   }

   public void a(aij $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws axd {
      return axc.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
