import javax.annotation.Nullable;

public class chu extends bsp {
   public final chw b;
   public final String c;
   private final bss d;

   public chu(chw $$0, String $$1, float $$2, float $$3) {
      super($$0.ak(), $$0.dP());
      this.d = bss.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(ur $$0) {
   }

   @Override
   protected void b(ur $$0) {
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Nullable
   @Override
   public cuk dC() {
      return this.b.dC();
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bsp $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zs<ace> dl() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bss a(btw $$0) {
      return this.d;
   }

   @Override
   public boolean dN() {
      return false;
   }
}
