import java.security.PublicKey;

public class aht implements yn<ahq> {
   public static final ye<vg, aht> a = yn.a(aht::a, aht::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public aht(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aht(vg $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public yp<aht> a() {
      return ahw.c;
   }

   public void a(ahq $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws awj {
      return awi.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
