import java.security.PublicKey;

public class ain implements ze<aik> {
   public static final yv<vx, ain> a = ze.a(ain::a, ain::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ain(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ain(vx $$0) {
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
   public zg<ain> a() {
      return aiq.c;
   }

   public void a(aik $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws axe {
      return axd.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
