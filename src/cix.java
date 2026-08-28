import javax.annotation.Nullable;

public class cix extends btr {
   public final cja b;
   public final String c;
   private final btu d;

   public cix(cja $$0, String $$1, float $$2, float $$3) {
      super($$0.ao(), $$0.dS());
      this.d = btu.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Override
   protected void a(ug $$0) {
   }

   @Override
   protected void b(ug $$0) {
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Nullable
   @Override
   public cvs dF() {
      return this.b.dF();
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean u(btr $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zl<aca> a(ari $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public btu a(buz $$0) {
      return this.d;
   }

   @Override
   public boolean dQ() {
      return false;
   }
}
