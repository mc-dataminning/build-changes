import javax.annotation.Nullable;

public class cfc extends bqa {
   public final cfe b;
   public final String c;
   private final bqd d;

   public cfc(cfe $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = bqd.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(aje.a $$0) {
   }

   @Override
   protected void a(to $$0) {
   }

   @Override
   protected void b(to $$0) {
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Nullable
   @Override
   public crs dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bqa $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public yp<aba> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bqd a(bre $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
