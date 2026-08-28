import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class der extends dej {
   public static final MapCodec<der> a = b(der::new);
   public static final dsu b = dit.aE;
   public static final dta c = dsq.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public der(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, je.c));
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dbw $$0, cmv $$1, iz $$2, dsa $$3, @Nullable dpf $$4, cun $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpc $$6) {
         if (czz.a(dab.v, $$5) == 0) {
            $$6.a($$1, $$3, dpc.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((arf)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dbw $$0, iz $$1) {
      evk $$2 = new evk($$1).c(8.0, 6.0, 8.0);
      List<cfe> $$3 = $$0.a(cfe.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmv> $$4 = $$0.a(cmv.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfe $$5 : $$3) {
            if ($$5.p() == null) {
               cmv $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dbw $$0, iz $$1) {
      a($$0, $$1, new cun(cuq.ww, 3));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cui $$9 = $$0.g();
         if ($$0.a(cuq.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avz.bX, awa.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btn.d($$5));
            $$8 = true;
            $$2.a($$4, dwt.M, $$3);
         } else if ($$0.a(cuq.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avz.cC, awa.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cun(cuq.wz));
            } else if (!$$4.gc().f(new cun(cuq.wz))) {
               $$4.a(new cun(cuq.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dwt.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awj.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfl.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpc.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqu.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dbw $$0, iz $$1) {
      return $$0.c_($$1) instanceof dpc $$3 ? !$$3.c() : false;
   }

   public void a(dbw $$0, dsa $$1, iz $$2, @Nullable cmv $$3, dpc.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpc $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dbw $$0, dsa $$1, iz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dbw $$0, iz $$1, dsa $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewi $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(je.a.b);
         if ($$4 >= 1.0 && !$$2.a(awo.ao)) {
            double $$5 = $$3.b(je.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iz $$6 = $$1.d();
               dsa $$7 = $$0.a_($$6);
               ewi $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(je.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dbw $$0, iz $$1, ewi $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(je.a.a), (double)$$1.u() + $$2.c(je.a.a), (double)$$1.w() + $$2.b(je.a.c), (double)$$1.w() + $$2.c(je.a.c), $$3);
   }

   private void a(dbw $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(li.av, ayx.d($$0.z.j(), $$1, $$2), $$5, ayx.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? null : a($$2, dph.H, dpc::a);
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbs.h) && $$0.c_($$1) instanceof dpc $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cun $$8 = new cun(this);
            $$8.b($$5.s());
            $$8.b(km.aa, cwy.a.a(c, $$6));
            cjf $$9 = new cjf($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cun> a(dsa $$0, eqj.a $$1) {
      bss $$2 = $$1.b(etc.a);
      if ($$2 instanceof cjg || $$2 instanceof cjn || $$2 instanceof cob || $$2 instanceof cit || $$2 instanceof cpd) {
         dpf $$3 = $$1.b(etc.h);
         if ($$3 instanceof dpc $$4) {
            $$4.a(null, $$0, dpc.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$3.a_($$5).b() instanceof dhx && $$3.c_($$4) instanceof dpc $$7) {
         $$7.a(null, $$0, dpc.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
