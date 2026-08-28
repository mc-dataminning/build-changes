import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diw extends djm implements dqs {
   public static final dxo d = dxn.J;
   private static final fbu a = djm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected diw(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends diw> a();

   protected void a(dwx $$0, dfn $$1, dgx $$2, azh $$3, ji $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dwx $$0, dfn $$1, ji $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jn $$3 : jn.values()) {
            if ($$1.b_($$2.a($$3)).a(awv.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(awv.a) && $$1.e() == 8));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return a;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(d);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(d) ? eta.c.a(false) : super.b_($$0);
   }
}
