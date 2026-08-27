import java.util.List;
import javax.annotation.Nullable;

public class cka extends cjg {
   private static final int a = 32;

   public cka(cjg.a $$0) {
      super($$0);
   }

   @Override
   public cjl ai_() {
      return clk.a(super.ai_(), cll.c);
   }

   @Override
   public cjl a(cjl $$0, cqb $$1, bjm $$2) {
      cca $$3 = $$2 instanceof cca ? (cca)$$2 : null;
      if ($$3 instanceof aku) {
         al.z.a((aku)$$3, $$0);
      }

      if (!$$1.B) {
         for (bij $$5 : clk.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bij($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(apq.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new cjl(cjo.rw);
         }

         if ($$3 != null) {
            $$3.fS().e(new cjl(cjo.rw));
         }
      }

      $$2.a(djn.l);
      return $$0;
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      cca $$3 = $$0.o();
      cjl $$4 = $$0.n();
      dfd $$5 = $$1.a_($$2);
      if ($$0.k() != ha.a && $$5.a(apv.ca) && clk.d($$4) == cll.c) {
         $$1.a(null, $$2, apg.jb, aph.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cjn.a($$4, $$3, new cjl(cjo.rw)));
         $$3.b(apq.c.b($$4.d()));
         if (!$$1.B) {
            akt $$6 = (akt)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(iv.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, apg.ch, aph.e, 1.0F, 1.0F);
         $$1.a(null, djn.z, $$2);
         $$1.b($$2, cte.rH.o());
         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   @Override
   public int b(cjl $$0) {
      return 32;
   }

   @Override
   public cle c(cjl $$0) {
      return cle.c;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      return cjn.a($$0, $$1, $$2);
   }

   @Override
   public String j(cjl $$0) {
      return clk.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      clk.a($$0, $$2, 1.0F);
   }
}
