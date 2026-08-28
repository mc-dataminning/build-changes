import java.security.PublicKey;

public class ajf implements zo<ajc> {
   public static final zf<we, ajf> a = zo.a(ajf::a, ajf::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ajf(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajf(we $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zq<ajf> a() {
      return aji.c;
   }

   public void a(ajc $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws ayi {
      return ayh.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
