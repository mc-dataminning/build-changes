import java.util.Optional;

public class cys extends cyu {
   public cys(cyu.a $$0) {
      super($$0);
   }

   public static cyy a(cyu $$0, je<cyr> $$1) {
      cyy $$2 = new cyy($$0);
      $$2.b(kj.ab, new dbo($$1));
      return $$2;
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      Optional<? extends je<cyr>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cyr $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, azm.d($$5.b() * 20.0F));
         $$1.b(awx.c.b(this));
         return bub.c;
      } else {
         return bub.d;
      }
   }

   @Override
   public int a(cyy $$0, bxc $$1) {
      Optional<je<cyr>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azm.d(((cyr)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<je<cyr>> a(cyy $$0, jg.a $$1) {
      dbo $$2 = $$0.a(kj.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public cza b(cyy $$0) {
      return cza.i;
   }

   private static void a(div $$0, cqy $$1, cyr $$2) {
      awm $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awo.c, $$4, 1.0F);
      $$0.a(eez.B, $$1.dt(), eez.a.a($$1));
   }
}
