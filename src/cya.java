import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cya extends cys implements czi {
   public static final MapCodec<cya> a = b(cya::new);
   public static final dkf<dka> b = djx.bd;

   @Override
   public MapCodec<cya> a() {
      return a;
   }

   public cya(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(d, Boolean.valueOf(false)).a(b, dka.a));
   }

   @Override
   protected int g(djh $$0) {
      return 2;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.b($$3, $$5, $$2) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(csv $$0, hx $$1, djh $$2) {
      dgv $$3 = $$0.c_($$1);
      return $$3 instanceof dhg ? ((dhg)$$3).c() : 0;
   }

   private int e(ctp $$0, hx $$1, djh $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cuf)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dka.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(ctp $$0, hx $$1, djh $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cuf)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dka.a;
      }
   }

   @Override
   protected int b(ctp $$0, hx $$1, djh $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ic $$4 = $$2.c(aE);
      hx $$5 = $$1.a($$4);
      djh $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cbn $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cbn a(ctp $$0, ic $$1, hx $$2) {
      List<cbn> $$3 = $$0.a(
         cbn.class,
         new elo((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if (!$$3.fT().e) {
         return bkb.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == dka.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, ars.eO, art.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bkb.a($$1.B);
      }
   }

   @Override
   protected void c(ctp $$0, hx $$1, djh $$2) {
      if (!$$0.N().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dgv $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dhg ? ((dhg)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eno $$6 = this.b($$0, $$1, $$2) ? eno.c : eno.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(ctp $$0, hx $$1, djh $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dgv $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dhg $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dka.a) {
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
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(djh $$0, ctp $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgv $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhg($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE, b, d);
   }
}
