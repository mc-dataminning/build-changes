import javax.annotation.Nullable;

public class cgy extends bru {
   public final cha b;
   public final String c;
   private final brx d;

   public cgy(cha $$0, String $$1, float $$2, float $$3) {
      super($$0.ak(), $$0.dP());
      this.d = brx.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajv.a $$0) {
   }

   @Override
   protected void a(ud $$0) {
   }

   @Override
   protected void b(ud $$0) {
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Nullable
   @Override
   public cto dC() {
      return this.b.dC();
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bru $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public ze<abq> dl() {
      throw new UnsupportedOperationException();
   }

   @Override
   public brx a(bta $$0) {
      return this.d;
   }

   @Override
   public boolean dN() {
      return false;
   }
}
