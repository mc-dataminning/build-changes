import java.security.PublicKey;

public class ajg implements zp<ajd> {
   public static final zg<wf, ajg> a = zp.a(ajg::a, ajg::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ajg(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajg(wf $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zr<ajg> a() {
      return ajj.c;
   }

   public void a(ajd $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws ayj {
      return ayi.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
