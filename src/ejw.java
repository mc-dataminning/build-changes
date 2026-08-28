import com.mojang.serialization.Codec;

public class ejw extends eit<elf> {
   private static final int a = 7;

   ejw(Codec<elf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<elf> $$0) {
      djo $$1 = $$0.b();
      azt $$2 = $$0.d();
      elf $$3 = $$0.f();
      iu $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      iu.a $$6 = new iu.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dzo $$8 = $$1.a_($$6);

         for (elf.a $$9 : $$3.b) {
            if (ejo.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(iu.a $$0, azt $$1, iu $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azt $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
