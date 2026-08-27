import com.mojang.serialization.Codec;

public class eba extends dzx<ecj> {
   private static final int a = 7;

   eba(Codec<ecj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecj> $$0) {
      dbs $$1 = $$0.b();
      ayk $$2 = $$0.d();
      ecj $$3 = $$0.f();
      io $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      io.a $$6 = new io.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         drb $$8 = $$1.a_($$6);

         for (ecj.a $$9 : $$3.b) {
            if (eas.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(io.a $$0, ayk $$1, io $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(ayk $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
