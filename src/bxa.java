import javax.annotation.Nullable;

public class bxa extends bil {
   public final bxc b;
   public final String c;
   private final bim d;

   public bxa(bxc $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dK());
      this.d = bim.b($$2, $$3);
      this.e_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qu $$0) {
   }

   @Override
   protected void b(qu $$0) {
   }

   @Override
   public boolean br() {
      return true;
   }

   @Nullable
   @Override
   public cja dx() {
      return this.b.dx();
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bil $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public va<ws> U() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bim a(bjn $$0) {
      return this.d;
   }

   @Override
   public boolean dI() {
      return false;
   }
}
