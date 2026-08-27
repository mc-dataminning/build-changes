import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dds extends czf implements dgf {
   public static final MapCodec<dds> a = b(dds::new);
   public static final int b = 15;
   public static final dne c = dmu.aP;
   public static final dmv d = dmu.C;
   public static final ToIntFunction<dme> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public dds(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!$$1.B && $$3.gs()) {
         $$1.a($$2, $$0.a(c), 2);
         return bml.a;
      } else {
         return bml.b;
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return $$3.a(cpt.hB) ? epl.b() : epl.a();
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return true;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.a;
   }

   @Override
   protected float d(dme $$0, cvk $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cpq a(cpq $$0, int $$1) {
      if ($$1 != 15) {
         sy $$2 = new sy();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
