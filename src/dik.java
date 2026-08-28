import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dik extends dic {
   public static final MapCodec<dik> a = b(dik::new);
   public static final dws<jm> b = dml.aF;
   public static final dwu c = dwl.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dfm $$0, cou $$1, jh $$2, dvv $$3, @Nullable dsy $$4, cwm $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dsv $$6) {
         if (!dcf.a($$5, axf.q)) {
            $$6.a($$1, $$3, dsv.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((arq)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dfm $$0, jh $$1) {
      ezt $$2 = new ezt($$1).c(8.0, 6.0, 8.0);
      List<cgz> $$3 = $$0.a(cgz.class, $$2);
      if (!$$3.isEmpty()) {
         List<cou> $$4 = $$0.a(cou.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgz $$5 : $$3) {
            if ($$5.aa_() == null) {
               cou $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dfm $$0, jh $$1) {
      a($$0, $$1, new cwm(cwq.wS, 3));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cwi $$9 = $$0.h();
         if ($$0.a(cwq.sm)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awn.bX, awo.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvh.d($$5));
            $$8 = true;
            $$2.a($$4, ear.M, $$3);
         } else if ($$0.a(cwq.sB)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awn.cC, awo.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwm(cwq.wV));
            } else if (!$$4.gg().f(new cwm(cwq.wV))) {
               $$4.a(new cwm(cwq.wV), false);
            }

            $$8 = true;
            $$2.a($$4, ear.y, $$3);
         }

         if (!$$2.A_() && $$8) {
            $$4.b(awx.c.b($$9));
         }
      }

      if ($$8) {
         if (!dje.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dsv.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dfm $$0, jh $$1) {
      return $$0.c_($$1) instanceof dsv $$3 ? !$$3.c() : false;
   }

   public void a(dfm $$0, dvv $$1, jh $$2, @Nullable cou $$3, dsv.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dsv $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dfm $$0, dvv $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dfm $$0, jh $$1, dvv $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fas $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axc.aq)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dvv $$7 = $$0.a_($$6);
               fas $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dfm $$0, jh $$1, fas $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dfm $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ls.av, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dsv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? null : a($$2, dta.H, dsv::a);
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if ($$0 instanceof arp $$4 && $$3.b() && $$4.N().b(dfi.h) && $$0.c_($$1) instanceof dsv $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cwm $$9 = new cwm(this);
            $$9.b($$6.r());
            $$9.b(ku.am, cyo.a.a(c, $$7));
            clc $$10 = new clc($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.n();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwm> a(dvv $$0, euq.a $$1) {
      bul $$2 = $$1.b(exj.a);
      if ($$2 instanceof cld || $$2 instanceof clk || $$2 instanceof cqb || $$2 instanceof ckp || $$2 instanceof crh) {
         dsy $$3 = $$1.b(exj.h);
         if ($$3 instanceof dsv $$4) {
            $$4.a(null, $$0, dsv.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$1.a_($$5).b() instanceof dlp && $$1.c_($$3) instanceof dsv $$9) {
         $$9.a(null, $$0, dsv.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyo $$4 = $$0.a(ku.am, cyo.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xj.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xj.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
