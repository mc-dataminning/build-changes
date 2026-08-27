import java.security.PublicKey;

public class aih implements zb<aie> {
   public static final ys<vu, aih> a = zb.a(aih::a, aih::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public aih(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aih(vu $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zd<aih> a() {
      return aik.c;
   }

   public void a(aie $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws awy {
      return awx.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
