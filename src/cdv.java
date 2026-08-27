import javax.annotation.Nullable;

public class cdv extends bow {
   public final cdx b;
   public final String c;
   private final boz d;

   public cdv(cdx $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = boz.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(aiq.a $$0) {
   }

   @Override
   protected void a(ta $$0) {
   }

   @Override
   protected void b(ta $$0) {
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Nullable
   @Override
   public cqk dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bow $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public yb<aam> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boz a(bpz $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
