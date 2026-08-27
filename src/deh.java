import com.mojang.serialization.MapCodec;

public class deh extends cwy {
   public static final MapCodec<deh> b = b(deh::new);
   public static final dkg c = dkf.z;

   @Override
   protected MapCodec<? extends deh> a() {
      return b;
   }

   protected deh(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(djp $$0) {
      return $$0.a(asi.by);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }
}
