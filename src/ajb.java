import java.security.PublicKey;

public class ajb implements zs<aiy> {
   public static final zj<wl, ajb> a = zs.a(ajb::a, ajb::new);
   private final String b;
   private final byte[] c;
   private final byte[] d;
   private final boolean e;

   public ajb(String $$0, byte[] $$1, byte[] $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajb(wl $$0) {
      this.b = $$0.d(20);
      this.c = $$0.b();
      this.d = $$0.b();
      this.e = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zu<ajb> a() {
      return aje.c;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public PublicKey e() throws axt {
      return axs.a(this.c);
   }

   public byte[] f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
