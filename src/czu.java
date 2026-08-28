import java.util.Optional;

public class czu extends czw {
   public czu(czw.a $$0) {
      super($$0);
   }

   public static daa a(czw $$0, jg<czt> $$1) {
      daa $$2 = new daa($$0);
      $$2.b(kl.ab, new dcq($$1));
      return $$2;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      Optional<? extends jg<czt>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         czt $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gF().a($$3, azq.d($$5.b() * 20.0F));
         $$1.b(axb.c.b(this));
         return but.c;
      } else {
         return but.d;
      }
   }

   @Override
   public int a(daa $$0, bxw $$1) {
      Optional<jg<czt>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azq.d(((czt)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jg<czt>> a(daa $$0, ji.a $$1) {
      dcq $$2 = $$0.a(kl.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public dac b(daa $$0) {
      return dac.i;
   }

   private static void a(djz $$0, crz $$1, czt $$2) {
      awq $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aws.c, $$4, 1.0F);
      $$0.a(egg.B, $$1.dt(), egg.a.a($$1));
   }
}
