import java.security.PublicKey;

public class air implements yv<aip> {
   public static final ym<vl, air> a = yv.a(air::a, air::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public air(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private air(vl $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public yx<air> a() {
      return aiv.c;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws axx {
      return axw.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
