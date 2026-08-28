import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dml extends dmd {
   public static final MapCodec<dml> a = b(dml::new);
   public static final ebr<jb> b = dqs.e;
   public static final ebt c = ebj.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)).b(b, jb.c));
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(djm $$0, crm $$1, iv $$2, eat $$3, @Nullable dxr $$4, czn $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dxo $$6) {
         if (!dgc.a($$5, axe.q)) {
            $$6.a($$1, $$3, dxo.b.c);
            buc.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         aq.L.a((arr)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(djm $$0, iv $$1) {
      fex $$2 = new fex($$1).c(8.0, 6.0, 8.0);
      List<cja> $$3 = $$0.a(cja.class, $$2);
      if (!$$3.isEmpty()) {
         List<crm> $$4 = $$0.a(crm.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cja $$5 : $$3) {
            if ($$5.f() == null) {
               crm $$6 = ag.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(djm $$0, iv $$1) {
      a($$0, $$1, new czn(czr.xL, 3));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         czj $$9 = $$0.h();
         if ($$0.a(czr.td)) {
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), awn.bX, awo.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bxj.d($$5));
            $$8 = true;
            $$2.a($$4, eft.M, $$3);
         } else if ($$0.a(czr.ts)) {
            $$0.h(1);
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), awn.cC, awo.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new czn(czr.xO));
            } else if (!$$4.gi().g(new czn(czr.xO))) {
               $$4.a(new czn(czr.xO), false);
            }

            $$8 = true;
            $$2.a($$4, eft.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awx.c.b($$9));
         }
      }

      if ($$8) {
         if (!dnh.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dxo.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(djm $$0, iv $$1) {
      return $$0.c_($$1) instanceof dxo $$3 ? !$$3.c() : false;
   }

   public void a(djm $$0, eat $$1, iv $$2, @Nullable crm $$3, dxo.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dxo $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(djm $$0, eat $$1, iv $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(djm $$0, iv $$1, eat $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         ffw $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jb.a.b);
         if ($$4 >= 1.0 && !$$2.a(axc.ar)) {
            double $$5 = $$3.b(jb.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iv $$6 = $$1.e();
               eat $$7 = $$0.a_($$6);
               ffw $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jb.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(djm $$0, iv $$1, ffw $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jb.a.a), (double)$$1.u() + $$2.c(jb.a.a), (double)$$1.w() + $$2.b(jb.a.c), (double)$$1.w() + $$2.c(jb.a.c), $$3);
   }

   private void a(djm $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ly.ay, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? null : a($$2, dxt.I, dxo::a);
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      if ($$0 instanceof arq $$4 && $$3.gk() && $$4.O().c(dji.i) && $$0.c_($$1) instanceof dxo $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            czn $$9 = new czn(this);
            $$9.b($$6.q());
            $$9.b(kk.aq, dbn.a.a(c, $$7));
            cnr $$10 = new cnr($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czn> a(eat $$0, ezw.a $$1) {
      bwi $$2 = $$1.b(fcn.a);
      if ($$2 instanceof cns || $$2 instanceof cnz || $$2 instanceof csw || $$2 instanceof cne || $$2 instanceof cun) {
         dxr $$3 = $$1.b(fcn.h);
         if ($$3 instanceof dxo $$4) {
            $$4.a(null, $$0, dxo.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      czn $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kk.aq, dbn.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$1.a_($$5).b() instanceof dpt && $$1.c_($$3) instanceof dxo $$9) {
         $$9.a(null, $$0, dxo.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
