import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dot extends deb {
   public static final MapCodec<dot> b = b(dot::new);
   public static final dpx<dqb> c = dpp.bg;
   public static final dpq d = dpp.x;
   public static final float e = 4.0F;
   protected static final est f = dby.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final est g = dby.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final est h = dby.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final est i = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final est j = dby.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final est k = dby.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final est o = dby.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final est F = dby.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final est G = dby.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final est H = dby.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final est I = dby.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final est J = dby.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final est K = dby.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final est L = dby.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final est M = dby.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final est N = dby.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final est O = dby.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final est P = dby.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final est[] Q = a(true);
   private static final est[] R = a(false);

   @Override
   protected MapCodec<dot> a() {
      return b;
   }

   private static est[] a(boolean $$0) {
      return Arrays.stream(ih.values()).map($$1 -> a($$1, $$0)).toArray(est[]::new);
   }

   private static est a(ih $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return esq.a(k, $$1 ? L : F);
         case b:
            return esq.a(j, $$1 ? K : o);
         case c:
            return esq.a(i, $$1 ? N : H);
         case d:
            return esq.a(h, $$1 ? M : G);
         case e:
            return esq.a(g, $$1 ? P : J);
         case f:
            return esq.a(f, $$1 ? O : I);
      }
   }

   public dot(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(c, dqb.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(doz $$0, doz $$1) {
      dby $$2 = $$0.c(c) == dqb.a ? dca.by : dca.br;
      return $$1.a($$2) && $$1.c(dos.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.B && $$3.ga().d) {
         ib $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ib $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dca.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if ($$0.a((cza)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj($$2.c(c) == dqb.b ? dca.br : dca.by);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
