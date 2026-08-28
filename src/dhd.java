import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhd extends dgv {
   public static final MapCodec<dhd> a = b(dhd::new);
   public static final dvi b = dlf.aF;
   public static final dvo c = dve.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dhd(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jj.c));
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(deg $$0, cnu $$1, je $$2, duo $$3, @Nullable drs $$4, cvp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof drp $$6) {
         if (!dbm.a($$5, aww.q)) {
            $$6.a($$1, $$3, drp.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((ari)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(deg $$0, je $$1) {
      eyn $$2 = new eyn($$1).c(8.0, 6.0, 8.0);
      List<cgb> $$3 = $$0.a(cgb.class, $$2);
      if (!$$3.isEmpty()) {
         List<cnu> $$4 = $$0.a(cnu.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgb $$5 : $$3) {
            if ($$5.m() == null) {
               cnu $$6 = ad.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(deg $$0, je $$1) {
      a($$0, $$1, new cvp(cvt.wC, 3));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cvk $$9 = $$0.h();
         if ($$0.a(cvt.rW)) {
            $$2.a($$4, $$4.dx(), $$4.dz(), $$4.dD(), awe.bX, awf.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, buk.d($$5));
            $$8 = true;
            $$2.a($$4, dzl.M, $$3);
         } else if ($$0.a(cvt.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dx(), $$4.dz(), $$4.dD(), awe.cC, awf.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cvp(cvt.wF));
            } else if (!$$4.gc().f(new cvp(cvt.wF))) {
               $$4.a(new cvp(cvt.wF), false);
            }

            $$8 = true;
            $$2.a($$4, dzl.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awo.c.b($$9));
         }
      }

      if ($$8) {
         if (!dhx.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, drp.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return brp.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(deg $$0, je $$1) {
      return $$0.c_($$1) instanceof drp $$3 ? !$$3.c() : false;
   }

   public void a(deg $$0, duo $$1, je $$2, @Nullable cnu $$3, drp.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof drp $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(deg $$0, duo $$1, je $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(deg $$0, je $$1, duo $$2) {
      if ($$2.y().c() && !($$0.z.i() < 0.3F)) {
         ezm $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jj.a.b);
         if ($$4 >= 1.0 && !$$2.a(awt.ap)) {
            double $$5 = $$3.b(jj.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               je $$6 = $$1.e();
               duo $$7 = $$0.a_($$6);
               ezm $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jj.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(deg $$0, je $$1, ezm $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jj.a.a), (double)$$1.u() + $$2.c(jj.a.a), (double)$$1.w() + $$2.b(jj.a.c), (double)$$1.w() + $$2.c(jj.a.c), $$3);
   }

   private void a(deg $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ln.av, azd.d($$0.z.j(), $$1, $$2), $$5, azd.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.g().g());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new drp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? null : a($$2, dru.H, drp::a);
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.B && $$3.f() && $$0.ac().b(dec.h) && $$0.c_($$1) instanceof drp $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cvp $$8 = new cvp(this);
            $$8.b($$5.r());
            $$8.b(kr.ah, cxx.a.a(c, $$6));
            cke $$9 = new cke($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.q();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvp> a(duo $$0, etk.a $$1) {
      bto $$2 = $$1.b(ewd.a);
      if ($$2 instanceof ckf || $$2 instanceof ckm || $$2 instanceof cpc || $$2 instanceof cjr || $$2 instanceof cqf) {
         drs $$3 = $$1.b(ewd.h);
         if ($$3 instanceof drp $$4) {
            $$4.a(null, $$0, drp.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$3.a_($$5).b() instanceof dkj && $$3.c_($$4) instanceof drp $$7) {
         $$7.a(null, $$0, drp.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
