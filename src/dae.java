import java.util.Optional;

public class dae extends dag {
   public dae(dag.a $$0) {
      super($$0);
   }

   public static dak a(dag $$0, jg<dad> $$1) {
      dak $$2 = new dak($$0);
      $$2.b(kl.ab, new dda($$1));
      return $$2;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      Optional<? extends jg<dad>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         dad $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gF().a($$3, azz.d($$5.b() * 20.0F));
         $$1.b(axi.c.b(this));
         return bvc.c;
      } else {
         return bvc.d;
      }
   }

   @Override
   public int a(dak $$0, byf $$1) {
      Optional<jg<dad>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azz.d(((dad)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jg<dad>> a(dak $$0, ji.a $$1) {
      dda $$2 = $$0.a(kl.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public dam b(dak $$0) {
      return dam.i;
   }

   private static void a(dkj $$0, csi $$1, dad $$2) {
      awx $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awz.c, $$4, 1.0F);
      $$0.a(egq.B, $$1.dt(), egq.a.a($$1));
   }
}
