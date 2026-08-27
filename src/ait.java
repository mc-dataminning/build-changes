import java.security.PublicKey;

public class ait implements zl<aiq> {
   public static final zc<we, ait> a = zl.a(ait::a, ait::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ait(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ait(we $$0) {
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
   public zn<ait> a() {
      return aiw.c;
   }

   public void a(aiq $$0) {
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
