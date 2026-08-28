import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class des extends dek {
   public static final MapCodec<des> a = b(des::new);
   public static final dsv b = diu.aE;
   public static final dtb c = dsr.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, je.c));
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dbx $$0, cmw $$1, iz $$2, dsb $$3, @Nullable dpg $$4, cuo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpd $$6) {
         if (daa.a(dac.v, $$5) == 0) {
            $$6.a($$1, $$3, dpd.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((arf)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dbx $$0, iz $$1) {
      evl $$2 = new evl($$1).c(8.0, 6.0, 8.0);
      List<cff> $$3 = $$0.a(cff.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmw> $$4 = $$0.a(cmw.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cff $$5 : $$3) {
            if ($$5.p() == null) {
               cmw $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dbx $$0, iz $$1) {
      a($$0, $$1, new cuo(cur.ww, 3));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cuj $$9 = $$0.g();
         if ($$0.a(cur.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avz.bX, awa.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bto.d($$5));
            $$8 = true;
            $$2.a($$4, dwu.M, $$3);
         } else if ($$0.a(cur.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avz.cC, awa.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cuo(cur.wz));
            } else if (!$$4.gc().f(new cuo(cur.wz))) {
               $$4.a(new cuo(cur.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dwu.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awj.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfm.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpd.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqv.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dbx $$0, iz $$1) {
      return $$0.c_($$1) instanceof dpd $$3 ? !$$3.c() : false;
   }

   public void a(dbx $$0, dsb $$1, iz $$2, @Nullable cmw $$3, dpd.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpd $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dbx $$0, dsb $$1, iz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dbx $$0, iz $$1, dsb $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewj $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(je.a.b);
         if ($$4 >= 1.0 && !$$2.a(awo.ao)) {
            double $$5 = $$3.b(je.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iz $$6 = $$1.d();
               dsb $$7 = $$0.a_($$6);
               ewj $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(je.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dbx $$0, iz $$1, ewj $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(je.a.a), (double)$$1.u() + $$2.c(je.a.a), (double)$$1.w() + $$2.b(je.a.c), (double)$$1.w() + $$2.c(je.a.c), $$3);
   }

   private void a(dbx $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(li.av, ayy.d($$0.z.j(), $$1, $$2), $$5, ayy.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? null : a($$2, dpi.H, dpd::a);
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbt.h) && $$0.c_($$1) instanceof dpd $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuo $$8 = new cuo(this);
            $$8.b($$5.s());
            $$8.b(km.ab, cwz.a.a(c, $$6));
            cjg $$9 = new cjg($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuo> a(dsb $$0, eqk.a $$1) {
      bst $$2 = $$1.b(etd.a);
      if ($$2 instanceof cjh || $$2 instanceof cjo || $$2 instanceof coc || $$2 instanceof ciu || $$2 instanceof cpe) {
         dpg $$3 = $$1.b(etd.h);
         if ($$3 instanceof dpd $$4) {
            $$4.a(null, $$0, dpd.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$3.a_($$5).b() instanceof dhy && $$3.c_($$4) instanceof dpd $$7) {
         $$7.a(null, $$0, dpd.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
