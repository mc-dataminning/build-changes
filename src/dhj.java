import com.mojang.serialization.MapCodec;

public class dhj extends daa {
   public static final MapCodec<dhj> b = b(dhj::new);
   public static final dnq c = dnp.z;

   @Override
   protected MapCodec<? extends dhj> a() {
      return b;
   }

   protected dhj(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dmz a(css $$0) {
      dmz $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dmz $$0) {
      return $$0.a(aun.bz);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }
}
