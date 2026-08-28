import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djf extends dix {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dxt<jn> b = dnj.aF;
   public static final dxv c = dxm.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jn.c));
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dgh $$0, cow $$1, ji $$2, dww $$3, @Nullable dty $$4, cwo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dtv $$6) {
         if (!dda.a($$5, aws.q)) {
            $$6.a($$1, $$3, dtv.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ap.L.a((are)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dgh $$0, ji $$1) {
      fau $$2 = new fau($$1).c(8.0, 6.0, 8.0);
      List<cgy> $$3 = $$0.a(cgy.class, $$2);
      if (!$$3.isEmpty()) {
         List<cow> $$4 = $$0.a(cow.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgy $$5 : $$3) {
            if ($$5.O_() == null) {
               cow $$6 = af.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dgh $$0, ji $$1) {
      a($$0, $$1, new cwo(cws.xA, 3));
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cwk $$9 = $$0.h();
         if ($$0.a(cws.sS)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvg.d($$5));
            $$8 = true;
            $$2.a($$4, ebs.M, $$3);
         } else if ($$0.a(cws.th)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwo(cws.xD));
            } else if (!$$4.gi().f(new cwo(cws.xD))) {
               $$4.a(new cwo(cws.xD), false);
            }

            $$8 = true;
            $$2.a($$4, ebs.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dka.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dtv.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dgh $$0, ji $$1) {
      return $$0.c_($$1) instanceof dtv $$3 ? !$$3.c() : false;
   }

   public void a(dgh $$0, dww $$1, ji $$2, @Nullable cow $$3, dtv.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dtv $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dgh $$0, dww $$1, ji $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dgh $$0, ji $$1, dww $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fbt $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jn.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ar)) {
            double $$5 = $$3.b(jn.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ji $$6 = $$1.e();
               dww $$7 = $$0.a_($$6);
               fbt $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jn.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dgh $$0, ji $$1, fbt $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jn.a.a), (double)$$1.u() + $$2.c(jn.a.a), (double)$$1.w() + $$2.b(jn.a.c), (double)$$1.w() + $$2.c(jn.a.c), $$3);
   }

   private void a(dgh $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lt.ax, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? null : a($$2, dua.I, dtv::a);
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if ($$0 instanceof ard $$4 && $$3.b() && $$4.O().b(dgd.h) && $$0.c_($$1) instanceof dtv $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cwo $$9 = new cwo(this);
            $$9.b($$6.q());
            $$9.b(kv.am, cyq.a.a(c, $$7));
            clb $$10 = new clb($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwo> a(dww $$0, evt.a $$1) {
      buk $$2 = $$1.b(eyk.a);
      if ($$2 instanceof clc || $$2 instanceof clj || $$2 instanceof cqd || $$2 instanceof cko || $$2 instanceof crj) {
         dty $$3 = $$1.b(eyk.h);
         if ($$3 instanceof dtv $$4) {
            $$4.a(null, $$0, dtv.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      cwo $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kv.am, cyq.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$1.a_($$5).b() instanceof dmm && $$1.c_($$3) instanceof dtv $$9) {
         $$9.a(null, $$0, dtv.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyq $$4 = $$0.a(kv.am, cyq.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kv.an, List.of()).size();
      $$2.add(wp.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(wp.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
