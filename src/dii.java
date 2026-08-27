import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dii extends dhq implements dgf {
   public static final MapCodec<dii> a = b(dii::new);
   public static final dmv c = dmu.C;

   @Override
   protected MapCodec<? extends dii> a() {
      return a;
   }

   protected dii(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(ehs.c)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(c) ? ehs.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }
}
