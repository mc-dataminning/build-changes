import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgd extends dby implements diy {
   public static final MapCodec<dgd> a = b(dgd::new);
   public static final dpt b = dft.aE;
   public static final dpq c = dpp.C;
   protected static final float d = 3.0F;
   protected static final est e = dby.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final est f = dby.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final est g = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final est h = dby.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   protected dgd(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((ih)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cyd $$0, ib $$1, ih $$2) {
      doz $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dca.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      if (!$$0.c()) {
         doz $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      doz $$2 = this.n();
      cza $$3 = $$0.q();
      ib $$4 = $$0.a();
      eks $$5 = $$0.q().b_($$0.a());

      for (ih $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ekt.c));
            }
         }
      }

      return null;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }
}
