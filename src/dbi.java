import com.mojang.serialization.MapCodec;

public class dbi extends cua {
   public static final MapCodec<dbi> b = b(dbi::new);
   public static final dgs c = dgr.z;

   @Override
   protected MapCodec<? extends dbi> a() {
      return b;
   }

   protected dbi(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dgb $$0) {
      return $$0.a(aqs.by);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }
}
