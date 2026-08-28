import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dia extends diq implements dpr {
   public static final dwm d = dwl.C;
   private static final fas a = diq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dia(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dia> a();

   protected void a(dvv $$0, der $$1, dgb $$2, azu $$3, jh $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dvv $$0, der $$1, jh $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jm $$3 : jm.values()) {
            if ($$1.b_($$2.a($$3)).a(axi.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return this.m().b(d, Boolean.valueOf($$1.a(axi.a) && $$1.e() == 8));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return a;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(d) ? erw.c.a(false) : super.b_($$0);
   }
}
