import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djg extends diy {
   public static final MapCodec<djg> a = b(djg::new);
   public static final dxu<jn> b = dnk.aF;
   public static final dxw c = dxn.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jn.c));
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dgi $$0, cox $$1, ji $$2, dwx $$3, @Nullable dtz $$4, cwp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dtw $$6) {
         if (!ddb.a($$5, aws.q)) {
            $$6.a($$1, $$3, dtw.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ap.L.a((ard)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dgi $$0, ji $$1) {
      fav $$2 = new fav($$1).c(8.0, 6.0, 8.0);
      List<cgy> $$3 = $$0.a(cgy.class, $$2);
      if (!$$3.isEmpty()) {
         List<cox> $$4 = $$0.a(cox.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgy $$5 : $$3) {
            if ($$5.O_() == null) {
               cox $$6 = af.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dgi $$0, ji $$1) {
      a($$0, $$1, new cwp(cwt.xA, 3));
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cwl $$9 = $$0.h();
         if ($$0.a(cwt.sS)) {
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvg.d($$5));
            $$8 = true;
            $$2.a($$4, ebt.M, $$3);
         } else if ($$0.a(cwt.th)) {
            $$0.h(1);
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwp(cwt.xD));
            } else if (!$$4.gi().f(new cwp(cwt.xD))) {
               $$4.a(new cwp(cwt.xD), false);
            }

            $$8 = true;
            $$2.a($$4, ebt.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dkb.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dtw.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dgi $$0, ji $$1) {
      return $$0.c_($$1) instanceof dtw $$3 ? !$$3.c() : false;
   }

   public void a(dgi $$0, dwx $$1, ji $$2, @Nullable cox $$3, dtw.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dtw $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dgi $$0, dwx $$1, ji $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dgi $$0, ji $$1, dwx $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fbu $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jn.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ar)) {
            double $$5 = $$3.b(jn.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ji $$6 = $$1.e();
               dwx $$7 = $$0.a_($$6);
               fbu $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jn.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dgi $$0, ji $$1, fbu $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jn.a.a), (double)$$1.u() + $$2.c(jn.a.a), (double)$$1.w() + $$2.b(jn.a.c), (double)$$1.w() + $$2.c(jn.a.c), $$3);
   }

   private void a(dgi $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lt.ax, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dtw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? null : a($$2, dub.I, dtw::a);
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      if ($$0 instanceof arc $$4 && $$3.b() && $$4.O().b(dge.h) && $$0.c_($$1) instanceof dtw $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cwp $$9 = new cwp(this);
            $$9.b($$6.q());
            $$9.b(kv.am, cyr.a.a(c, $$7));
            clb $$10 = new clb($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwp> a(dwx $$0, evu.a $$1) {
      buk $$2 = $$1.b(eyl.a);
      if ($$2 instanceof clc || $$2 instanceof clj || $$2 instanceof cqe || $$2 instanceof cko || $$2 instanceof crk) {
         dtz $$3 = $$1.b(eyl.h);
         if ($$3 instanceof dtw $$4) {
            $$4.a(null, $$0, dtw.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      cwp $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kv.am, cyr.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$1.a_($$5).b() instanceof dmn && $$1.c_($$3) instanceof dtw $$9) {
         $$9.a(null, $$0, dtw.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyr $$4 = $$0.a(kv.am, cyr.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kv.an, List.of()).size();
      $$2.add(wo.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(wo.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
