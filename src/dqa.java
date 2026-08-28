import com.mojang.serialization.MapCodec;

public class dqa extends diq {
   public static final MapCodec<dqa> b = b(dqa::new);
   public static final dwm c = dwl.z;

   @Override
   protected MapCodec<? extends dqa> a() {
      return b;
   }

   protected dqa(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dvv $$0) {
      return $$0.a(axc.bA);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }
}
