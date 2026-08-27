import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends deg implements dcb, diy {
   public static final MapCodec<djc> c = b(djc::new);
   private static final dpq g = dpp.C;
   public static final dpt d = dpp.R;
   protected static final float e = 6.0F;
   protected static final est f = dby.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<djc> a() {
      return c;
   }

   public djc(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dpv.b).a(g, Boolean.valueOf(false)).a(d, ih.c));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return f;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(avc.bx) || $$1.b_($$2.c()).a(ekt.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      if (!$$0.x_()) {
         ib $$5 = $$1.c();
         doz $$6 = deg.c($$0, $$5, this.n().a(b, dpv.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(g) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      if ($$0.c(b) == dpv.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ib $$3 = $$2.d();
         doz $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      if ($$3.c(deg.b) == dpv.b) {
         ib $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dbv.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ib $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
