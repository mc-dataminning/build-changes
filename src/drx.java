import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drx extends dlv implements dof {
   public static final MapCodec<drx> c = b(drx::new);
   public static final dxu<dxs> d = dlv.b;
   protected static final float e = 6.0F;
   protected static final fbu f = djm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<drx> a() {
      return c;
   }

   public drx(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return f;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djo.ll);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(djo.bD);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = super.a($$0);
      if ($$1 != null) {
         esz $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      if ($$0.c(d) == dxs.a) {
         dwx $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dxs.b;
      } else {
         esz $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return eta.c.a(false);
   }

   @Override
   public boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return false;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      return false;
   }
}
