import javax.annotation.Nullable;

public class byx extends bki {
   public final byz b;
   public final String c;
   private final bkj d;

   public byx(byz $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dL());
      this.d = bkj.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void b_() {
   }

   @Override
   protected void a(rz $$0) {
   }

   @Override
   protected void b(rz $$0) {
   }

   @Override
   public boolean br() {
      return true;
   }

   @Nullable
   @Override
   public clb dy() {
      return this.b.dy();
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bki $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public wk<yd> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bkj a(blk $$0) {
      return this.d;
   }

   @Override
   public boolean dJ() {
      return false;
   }
}
