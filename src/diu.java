import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diu extends djk implements dqq {
   public static final dxm d = dxl.J;
   private static final fbs a = djk.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected diu(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends diu> a();

   protected void a(dwv $$0, dfl $$1, dgv $$2, azg $$3, ji $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dwv $$0, dfl $$1, ji $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jn $$3 : jn.values()) {
            if ($$1.b_($$2.a($$3)).a(awu.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(awu.a) && $$1.e() == 8));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return a;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(d);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(d) ? esy.c.a(false) : super.b_($$0);
   }
}
