import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsn extends djy implements dnv {
   public static final MapCodec<dsn> a = b(dsn::new);
   public static final dys<dze> b = dyl.bk;

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   protected dsn(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dze.b));
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwp($$0, $$1);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      dux $$5 = $$1.c_($$2);
      if ($$5 instanceof dwp) {
         return (btj)(((dwp)$$5).a($$3) ? btj.a : btj.e);
      } else {
         return btj.e;
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, @Nullable bwg $$3, cxp $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dux $$5 = $$0.c_($$1);
            if ($$5 instanceof dwp) {
               ((dwp)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if ($$1 instanceof ash) {
         if ($$1.c_($$2) instanceof dwp $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ash)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ash $$0, dwp $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
