import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfp extends dby implements diy {
   public static final MapCodec<dfp> a = b(dfp::new);
   private static final dpq c = dpp.C;
   protected static final est b = dby.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   protected dfp(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = super.a($$0);
      if ($$1 != null) {
         eks $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ekt.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.c();
      doz $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ih.a);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !this.a($$0, $$3, $$4)) {
         return dca.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
