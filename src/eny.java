import com.mojang.serialization.MapCodec;

public class eny extends enr {
   public static final MapCodec<eny> b = eah.a.fieldOf("state").xmap(eag.a::b, dmf::m).xmap(eny::new, $$0 -> $$0.c);
   private final dmf c;

   public eny(dmf $$0) {
      this.c = $$0;
   }

   @Override
   protected ens<?> a() {
      return ens.f;
   }

   @Override
   public eah a(azv $$0, iu $$1) {
      ja.a $$2 = ja.a.a($$0);
      return this.c.m().c(dsy.d, $$2);
   }
}
