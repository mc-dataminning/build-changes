import java.security.PublicKey;

public class ajh implements zj<ajf> {
   public static final za<vy, ajh> a = zj.a(ajh::a, ajh::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ajh(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajh(vy $$0) {
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
   public zl<ajh> a() {
      return ajl.c;
   }

   public void a(ajf $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws ayo {
      return ayn.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
