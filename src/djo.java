import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djo extends dke implements dri {
   public static final dye d = dyd.D;
   private static final fcm a = dke.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected djo(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends djo> a();

   protected void a(dxn $$0, dgf $$1, dhp $$2, bam $$3, jh $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dxn $$0, dgf $$1, jh $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$1.b_($$2.a($$3)).a(aya.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(aya.a) && $$1.e() == 8));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return a;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(d) ? etq.c.a(false) : super.b_($$0);
   }
}
