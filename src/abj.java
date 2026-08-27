import javax.annotation.Nullable;

public class abj implements xx<aag> {
   public static final xo<uq, abj> a = xx.a(abj::a, abj::new);
   private final int b;
   private final byte c;

   public abj(bnq $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private abj(uq $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(uq $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public xz<abj> a() {
      return aeq.C;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   @Nullable
   public bnq a(cvr $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
