import java.security.PublicKey;

public class aiq implements zf<ain> {
   public static final yw<vv, aiq> a = zf.a(aiq::a, aiq::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public aiq(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aiq(vv $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zh<aiq> a() {
      return ait.c;
   }

   public void a(ain $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws axl {
      return axk.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
