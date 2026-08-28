import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlo extends dlg {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final eam<ja> b = dpt.e;
   public static final eao c = eae.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)).b(b, ja.c));
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dip $$0, cqs $$1, iu $$2, dzo $$3, @Nullable dwn $$4, cys $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dwk $$6) {
         if (!dfh.a($$5, axc.q)) {
            $$6.a($$1, $$3, dwk.b.c);
            btu.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         ap.L.a((arp)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dip $$0, iu $$1) {
      fdr $$2 = new fdr($$1).c(8.0, 6.0, 8.0);
      List<cip> $$3 = $$0.a(cip.class, $$2);
      if (!$$3.isEmpty()) {
         List<cqs> $$4 = $$0.a(cqs.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cip $$5 : $$3) {
            if ($$5.f() == null) {
               cqs $$6 = af.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(dip $$0, iu $$1) {
      a($$0, $$1, new cys(cyw.xE, 3));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cyo $$9 = $$0.h();
         if ($$0.a(cyw.sW)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awl.bX, awm.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bwz.d($$5));
            $$8 = true;
            $$2.a($$4, eeo.M, $$3);
         } else if ($$0.a(cyw.tl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awl.cC, awm.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cys(cyw.xH));
            } else if (!$$4.gi().f(new cys(cyw.xH))) {
               $$4.a(new cys(cyw.xH), false);
            }

            $$8 = true;
            $$2.a($$4, eeo.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awv.c.b($$9));
         }
      }

      if ($$8) {
         if (!dmj.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dwk.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bty.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dip $$0, iu $$1) {
      return $$0.c_($$1) instanceof dwk $$3 ? !$$3.c() : false;
   }

   public void a(dip $$0, dzo $$1, iu $$2, @Nullable cqs $$3, dwk.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dwk $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dip $$0, dzo $$1, iu $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dip $$0, iu $$1, dzo $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         feq $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(ja.a.b);
         if ($$4 >= 1.0 && !$$2.a(axa.ar)) {
            double $$5 = $$3.b(ja.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iu $$6 = $$1.e();
               dzo $$7 = $$0.a_($$6);
               feq $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(ja.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dip $$0, iu $$1, feq $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ja.a.a), (double)$$1.u() + $$2.c(ja.a.a), (double)$$1.w() + $$2.b(ja.a.c), (double)$$1.w() + $$2.c(ja.a.c), $$3);
   }

   private void a(dip $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lx.ay, azk.d($$0.A.j(), $$1, $$2), $$5, azk.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? null : a($$2, dwp.I, dwk::a);
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if ($$0 instanceof aro $$4 && $$3.gk() && $$4.O().c(dil.h) && $$0.c_($$1) instanceof dwk $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cys $$9 = new cys(this);
            $$9.b($$6.q());
            $$9.b(kj.aq, das.a.a(c, $$7));
            cmx $$10 = new cmx($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cys> a(dzo $$0, eyq.a $$1) {
      bwa $$2 = $$1.b(fbh.a);
      if ($$2 instanceof cmy || $$2 instanceof cnf || $$2 instanceof csb || $$2 instanceof cmk || $$2 instanceof cts) {
         dwn $$3 = $$1.b(fbh.h);
         if ($$3 instanceof dwk $$4) {
            $$4.a(null, $$0, dwk.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      cys $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kj.aq, das.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$1.a_($$5).b() instanceof dov && $$1.c_($$3) instanceof dwk $$9) {
         $$9.a(null, $$0, dwk.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
