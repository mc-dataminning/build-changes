import javax.annotation.Nullable;

public class bwx extends bii {
   public final bwz b;
   public final String c;
   private final bij d;

   public bwx(bwz $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dK());
      this.d = bij.b($$2, $$3);
      this.e_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qr $$0) {
   }

   @Override
   protected void b(qr $$0) {
   }

   @Override
   public boolean br() {
      return true;
   }

   @Nullable
   @Override
   public cix dx() {
      return this.b.dx();
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bii $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public ux<wp> U() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bij a(bjk $$0) {
      return this.d;
   }

   @Override
   public boolean dI() {
      return false;
   }
}
