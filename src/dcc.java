import com.mojang.serialization.MapCodec;

public class dcc extends cut {
   public static final MapCodec<dcc> b = b(dcc::new);
   public static final dhn c = dhm.z;

   @Override
   protected MapCodec<? extends dcc> a() {
      return b;
   }

   protected dcc(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dgw $$0) {
      return $$0.a(arc.by);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }
}
