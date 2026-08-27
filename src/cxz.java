import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cxz extends cyr implements czh {
   public static final MapCodec<cxz> a = b(cxz::new);
   public static final dke<djz> b = djw.bd;

   @Override
   public MapCodec<cxz> a() {
      return a;
   }

   public cxz(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(d, Boolean.valueOf(false)).a(b, djz.a));
   }

   @Override
   protected int g(djg $$0) {
      return 2;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.b($$3, $$5, $$2) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(csu $$0, hx $$1, djg $$2) {
      dgu $$3 = $$0.c_($$1);
      return $$3 instanceof dhf ? ((dhf)$$3).c() : 0;
   }

   private int e(cto $$0, hx $$1, djg $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cue)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == djz.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cto $$0, hx $$1, djg $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cue)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == djz.a;
      }
   }

   @Override
   protected int b(cto $$0, hx $$1, djg $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ic $$4 = $$2.c(aE);
      hx $$5 = $$1.a($$4);
      djg $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cbm $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cbm a(cto $$0, ic $$1, hx $$2) {
      List<cbm> $$3 = $$0.a(
         cbm.class,
         new eln((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if (!$$3.fT().e) {
         return bka.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == djz.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, arr.eO, ars.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bka.a($$1.B);
      }
   }

   @Override
   protected void c(cto $$0, hx $$1, djg $$2) {
      if (!$$0.N().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dgu $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dhf ? ((dhf)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            enn $$6 = this.b($$0, $$1, $$2) ? enn.c : enn.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cto $$0, hx $$1, djg $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dgu $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dhf $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == djz.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(djg $$0, cto $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgu $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhf($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(aE, b, d);
   }
}
