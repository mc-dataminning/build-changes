import com.mojang.serialization.MapCodec;

public class dli extends ddy {
   public static final MapCodec<dli> b = b(dli::new);
   public static final drs c = drr.z;

   @Override
   protected MapCodec<? extends dli> a() {
      return b;
   }

   protected dli(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(drb $$0) {
      return $$0.a(avw.bz);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }
}
