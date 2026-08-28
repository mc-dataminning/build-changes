import java.util.Optional;

public class cze extends czg {
   public cze(czg.a $$0) {
      super($$0);
   }

   public static czk a(czg $$0, jf<czd> $$1) {
      czk $$2 = new czk($$0);
      $$2.b(kk.ab, new dca($$1));
      return $$2;
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      Optional<? extends jf<czd>> $$4 = this.a($$3, $$1.dW());
      if ($$4.isPresent()) {
         czd $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, azm.d($$5.b() * 20.0F));
         $$1.b(awx.c.b(this));
         return bug.c;
      } else {
         return bug.d;
      }
   }

   @Override
   public int a(czk $$0, bxj $$1) {
      Optional<jf<czd>> $$2 = this.a($$0, $$1.dW());
      return $$2.<Integer>map($$0x -> azm.d(((czd)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jf<czd>> a(czk $$0, jh.a $$1) {
      dca $$2 = $$0.a(kk.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public czm b(czk $$0) {
      return czm.i;
   }

   private static void a(djh $$0, crj $$1, czd $$2) {
      awm $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awo.c, $$4, 1.0F);
      $$0.a(efo.B, $$1.ds(), efo.a.a($$1));
   }
}
