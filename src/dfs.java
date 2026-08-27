import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfs extends dbk {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final dpt b = dpp.Q;
   public static final dpq c = dpp.f;
   private static final est d = dby.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final est e = dby.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final est f = esq.a(e, d);
   private static final est g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final est h = esq.a(f, g, ese.e);
   private static final est i = esq.a(h, dby.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final est j = esq.a(h, dby.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final est k = esq.a(h, dby.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final est l = esq.a(h, dby.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final est m = esq.a(h, dby.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final est n = g;
   private static final est o = esq.a(g, dby.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final est F = esq.a(g, dby.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final est G = esq.a(g, dby.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final est H = esq.a(g, dby.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   public dfs(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((ih)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2) {
      switch ((ih)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public doz a(cuo $$0) {
      ih $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == ih.a.b ? ih.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dne($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? null : a($$2, dmh.r, dne::a);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dne) {
            $$3.a((dne)$$5);
            $$3.a(auw.ad);
         }

         return boa.b;
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cyx $$0, ib $$1, doz $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
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
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      dmf $$4 = $$1.c_($$2);
      if ($$4 instanceof dne) {
         dne.a($$1, $$2, $$0, $$3, (dne)$$4);
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
