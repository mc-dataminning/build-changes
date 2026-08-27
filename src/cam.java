import javax.annotation.Nullable;

public class cam extends blv {
   public final cao b;
   public final String c;
   private final blw d;

   public cam(cao $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = blw.b($$2, $$3);
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
   public cmy dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(blv $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public xf<za> dj() {
      throw new UnsupportedOperationException();
   }

   @Override
   public blw a(bmx $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
