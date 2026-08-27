import com.mojang.serialization.MapCodec;

public class ddz extends cwq {
   public static final MapCodec<ddz> b = b(ddz::new);
   public static final djy c = djx.z;

   @Override
   protected MapCodec<? extends ddz> a() {
      return b;
   }

   protected ddz(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(djh $$0) {
      return $$0.a(ash.by);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }
}
