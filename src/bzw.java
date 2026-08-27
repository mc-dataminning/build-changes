import javax.annotation.Nullable;

public class bzw extends blf {
   public final bzy b;
   public final String c;
   private final blg d;

   public bzw(bzy $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = blg.b($$2, $$3);
      this.k_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sj $$0) {
   }

   @Override
   protected void b(sj $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public cmh dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(blf $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public wu<yo> dj() {
      throw new UnsupportedOperationException();
   }

   @Override
   public blg a(bmh $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
