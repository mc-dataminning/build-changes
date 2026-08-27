import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dea extends czf implements dgf {
   public static final MapCodec<dea> a = b(dea::new);
   public static final dmv b = dmu.C;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   protected dea(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dme $$0, dme $$1, ih $$2) {
      return $$1.a(czh.ac) && $$2.o() == ih.a.b;
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ehs.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(b) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
