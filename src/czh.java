import java.util.Optional;

public class czh extends czj {
   public czh(czj.a $$0) {
      super($$0);
   }

   public static czn a(czj $$0, jf<czg> $$1) {
      czn $$2 = new czn($$0);
      $$2.b(kk.ab, new dcd($$1));
      return $$2;
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      Optional<? extends jf<czg>> $$4 = this.a($$3, $$1.dW());
      if ($$4.isPresent()) {
         czg $$5 = $$4.get().a();
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
   public int a(czn $$0, bxj $$1) {
      Optional<jf<czg>> $$2 = this.a($$0, $$1.dW());
      return $$2.<Integer>map($$0x -> azm.d(((czg)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jf<czg>> a(czn $$0, jh.a $$1) {
      dcd $$2 = $$0.a(kk.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public czp b(czn $$0) {
      return czp.i;
   }

   private static void a(djm $$0, crm $$1, czg $$2) {
      awm $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awo.c, $$4, 1.0F);
      $$0.a(eft.B, $$1.ds(), eft.a.a($$1));
   }
}
