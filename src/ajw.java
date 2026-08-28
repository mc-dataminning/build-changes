import java.security.PublicKey;

public class ajw implements aac<aju> {
   public static final zt<ws, ajw> a = aac.a(ajw::a, ajw::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ajw(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajw(ws $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public aae<ajw> a() {
      return aka.c;
   }

   public void a(aju $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws azd {
      return azc.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
