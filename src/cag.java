import javax.annotation.Nullable;

public class cag extends bzw {
   public cag(bly<? extends cag> $$0, cto $$1) {
      super($$0, $$1);
   }

   public static bnp.a u() {
      return gE().a(bnq.l, 15.0).a(bnq.m, 0.2F);
   }

   public static boolean c(bly<? extends bxx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return !bmo.a($$2) ? bxx.b($$0, $$1, $$2, $$3, $$4) : bmo.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auu $$0) {
      this.a(bnq.h).a(a($$0::j));
   }

   @Override
   public bmp eS() {
      return bmp.b;
   }

   @Override
   protected arq y() {
      return arr.Cj;
   }

   @Override
   protected arq n_() {
      return arr.Ck;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Cl;
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      return bly.bs.a((cto)$$0);
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      return !this.gt() ? bka.d : super.b($$0, $$1);
   }

   @Override
   protected void gu() {
   }

   @Override
   protected float a(blv $$0, float $$1) {
      return $$0.b - (this.o_() ? 0.03125F : 0.28125F) * $$1;
   }
}
