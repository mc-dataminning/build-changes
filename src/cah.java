import javax.annotation.Nullable;

public class cah extends bzx {
   public cah(blz<? extends cah> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static bnq.a u() {
      return gE().a(bnr.l, 15.0).a(bnr.m, 0.2F);
   }

   public static boolean c(blz<? extends bxy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return !bmp.a($$2) ? bxy.b($$0, $$1, $$2, $$3, $$4) : bmp.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auv $$0) {
      this.a(bnr.h).a(a($$0::j));
   }

   @Override
   public bmq eS() {
      return bmq.b;
   }

   @Override
   protected arr y() {
      return ars.Cj;
   }

   @Override
   protected arr n_() {
      return ars.Ck;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Cl;
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      return blz.bs.a((ctp)$$0);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      return !this.gt() ? bkb.d : super.b($$0, $$1);
   }

   @Override
   protected void gu() {
   }

   @Override
   protected float a(blw $$0, float $$1) {
      return $$0.b - (this.o_() ? 0.03125F : 0.28125F) * $$1;
   }
}
