import javax.annotation.Nullable;

public class cal extends blu {
   public final can b;
   public final String c;
   private final blv d;

   public cal(can $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = blv.b($$2, $$3);
      this.k_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sn $$0) {
   }

   @Override
   protected void b(sn $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public cmx dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(blu $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public xf<za> dj() {
      throw new UnsupportedOperationException();
   }

   @Override
   public blv a(bmw $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
