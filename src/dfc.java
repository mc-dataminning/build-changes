import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfc extends deu {
   public static final MapCodec<dfc> a = b(dfc::new);
   public static final dtf b = dje.aE;
   public static final dtl c = dtb.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, jf.c));
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dcg $$0, cml $$1, ja $$2, dsl $$3, @Nullable dpq $$4, cud $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpn $$6) {
         if (!czo.a($$5, avz.q)) {
            $$6.a($$1, $$3, dpn.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aqn)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dcg $$0, ja $$1) {
      ewc $$2 = new ewc($$1).c(8.0, 6.0, 8.0);
      List<cet> $$3 = $$0.a(cet.class, $$2);
      if (!$$3.isEmpty()) {
         List<cml> $$4 = $$0.a(cml.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cet $$5 : $$3) {
            if ($$5.p() == null) {
               cml $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dcg $$0, ja $$1) {
      a($$0, $$1, new cud(cug.wz, 3));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cty $$9 = $$0.g();
         if ($$0.a(cug.rV)) {
            $$2.a($$4, $$4.dw(), $$4.dy(), $$4.dC(), avh.bX, avi.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btc.d($$5));
            $$8 = true;
            $$2.a($$4, dxh.M, $$3);
         } else if ($$0.a(cug.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dw(), $$4.dy(), $$4.dC(), avh.cC, avi.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cud(cug.wC));
            } else if (!$$4.ga().f(new cud(cug.wC))) {
               $$4.a(new cud(cug.wC), false);
            }

            $$8 = true;
            $$2.a($$4, dxh.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avr.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfw.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpn.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqj.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dcg $$0, ja $$1) {
      return $$0.c_($$1) instanceof dpn $$3 ? !$$3.c() : false;
   }

   public void a(dcg $$0, dsl $$1, ja $$2, @Nullable cml $$3, dpn.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpn $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dcg $$0, dsl $$1, ja $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dcg $$0, ja $$1, dsl $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         exa $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(jf.a.b);
         if ($$4 >= 1.0 && !$$2.a(avw.ao)) {
            double $$5 = $$3.b(jf.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ja $$6 = $$1.d();
               dsl $$7 = $$0.a_($$6);
               exa $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(jf.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dcg $$0, ja $$1, exa $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jf.a.a), (double)$$1.u() + $$2.c(jf.a.a), (double)$$1.w() + $$2.b(jf.a.c), (double)$$1.w() + $$2.c(jf.a.c), $$3);
   }

   private void a(dcg $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lj.av, ayg.d($$0.z.j(), $$1, $$2), $$5, ayg.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? null : a($$2, dps.H, dpn::a);
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dcc.h) && $$0.c_($$1) instanceof dpn $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cud $$8 = new cud(this);
            $$8.b($$5.s());
            $$8.b(kn.ab, cwn.a.a(c, $$6));
            civ $$9 = new civ($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cud> a(dsl $$0, eqz.a $$1) {
      bsh $$2 = $$1.b(ets.a);
      if ($$2 instanceof ciw || $$2 instanceof cjd || $$2 instanceof cnr || $$2 instanceof cii || $$2 instanceof cot) {
         dpq $$3 = $$1.b(ets.h);
         if ($$3 instanceof dpn $$4) {
            $$4.a(null, $$0, dpn.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$3.a_($$5).b() instanceof dii && $$3.c_($$4) instanceof dpn $$7) {
         $$7.a(null, $$0, dpn.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
