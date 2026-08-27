import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddi extends ddy implements dkz {
   public static final drs d = drr.C;
   private static final evd a = ddy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected ddi(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends ddi> a();

   protected void a(drb $$0, day $$1, io $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(drb $$0, dad $$1, io $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (it $$3 : it.values()) {
            if ($$1.b_($$2.a($$3)).a(awb.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(awb.a) && $$1.e() == 8));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return a;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1 == it.a && !this.a($$0, (dba)$$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, it.b);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }
}
