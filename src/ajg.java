import java.security.PublicKey;

public class ajg implements zq<aje> {
   public static final zh<wg, ajg> a = zq.a(ajg::a, ajg::new);
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

   private ajg(wg $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zs<ajg> a() {
      return ajk.c;
   }

   public void a(aje $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws ayl {
      return ayk.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
