import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends dke implements dri {
   public static final MapCodec<dnx> a = b(dnx::new);
   private static final dye c = dyd.D;
   protected static final fcm b = dke.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = super.a($$0);
      if ($$1 != null) {
         etp $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == etq.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxn $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jm.a);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.b && !this.a($$0, $$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etq.c, etq.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
