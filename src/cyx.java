import java.util.Optional;

public class cyx extends cyz {
   public cyx(cyz.a $$0) {
      super($$0);
   }

   public static czd a(cyz $$0, je<cyw> $$1) {
      czd $$2 = new czd($$0);
      $$2.b(kj.ab, new dbt($$1));
      return $$2;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      Optional<? extends je<cyw>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cyw $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gF().a($$3, azm.d($$5.b() * 20.0F));
         $$1.b(awx.c.b(this));
         return bud.c;
      } else {
         return bud.d;
      }
   }

   @Override
   public int a(czd $$0, bxe $$1) {
      Optional<je<cyw>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azm.d(((cyw)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<je<cyw>> a(czd $$0, jg.a $$1) {
      dbt $$2 = $$0.a(kj.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public czf b(czd $$0) {
      return czf.i;
   }

   private static void a(dja $$0, crc $$1, cyw $$2) {
      awm $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awo.c, $$4, 1.0F);
      $$0.a(efh.B, $$1.dt(), efh.a.a($$1));
   }
}
