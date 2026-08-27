import javax.annotation.Nullable;

public class cev extends bpv {
   public final cex b;
   public final String c;
   private final bpy d;

   public cev(cex $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = bpy.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajc.a $$0) {
   }

   @Override
   protected void a(tm $$0) {
   }

   @Override
   protected void b(tm $$0) {
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Nullable
   @Override
   public crj dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bpv $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public yn<aay> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bpy a(bqz $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
