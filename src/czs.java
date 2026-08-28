import java.util.Optional;

public class czs extends czu {
   public czs(czu.a $$0) {
      super($$0);
   }

   public static czy a(czu $$0, jf<czr> $$1) {
      czy $$2 = new czy($$0);
      $$2.b(kk.ab, new dco($$1));
      return $$2;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      Optional<? extends jf<czr>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         czr $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gF().a($$3, azo.d($$5.b() * 20.0F));
         $$1.b(awz.c.b(this));
         return bur.c;
      } else {
         return bur.d;
      }
   }

   @Override
   public int a(czy $$0, bxu $$1) {
      Optional<jf<czr>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azo.d(((czr)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jf<czr>> a(czy $$0, jh.a $$1) {
      dco $$2 = $$0.a(kk.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public daa b(czy $$0) {
      return daa.i;
   }

   private static void a(djx $$0, crx $$1, czr $$2) {
      awo $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awq.c, $$4, 1.0F);
      $$0.a(ege.B, $$1.dt(), ege.a.a($$1));
   }
}
