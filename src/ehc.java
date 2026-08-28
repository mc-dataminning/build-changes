import com.mojang.serialization.Codec;

public class ehc extends efz<eil> {
   private static final int a = 7;

   ehc(Codec<eil> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eil> $$0) {
      dhh $$1 = $$0.b();
      azh $$2 = $$0.d();
      eil $$3 = $$0.f();
      ji $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ji.a $$6 = new ji.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dwy $$8 = $$1.a_($$6);

         for (eil.a $$9 : $$3.b) {
            if (egu.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ji.a $$0, azh $$1, ji $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azh $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
