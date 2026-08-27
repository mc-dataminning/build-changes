import com.mojang.serialization.MapCodec;

public class ddi extends cvz {
   public static final MapCodec<ddi> b = b(ddi::new);
   public static final djg c = djf.z;

   @Override
   protected MapCodec<? extends ddi> a() {
      return b;
   }

   protected ddi(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dip $$0) {
      return $$0.a(arr.by);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }
}
