import com.mojang.serialization.MapCodec;

public class dgo extends czf {
   public static final MapCodec<dgo> b = b(dgo::new);
   public static final dmv c = dmu.z;

   @Override
   protected MapCodec<? extends dgo> a() {
      return b;
   }

   protected dgo(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dme $$0) {
      return $$0.a(aue.by);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }
}
