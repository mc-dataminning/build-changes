import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dje extends diw {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dxs<jn> b = dni.aF;
   public static final dxu c = dxl.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jn.c));
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dgg $$0, cov $$1, ji $$2, dwv $$3, @Nullable dtx $$4, cwn $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dtu $$6) {
         if (!dcz.a($$5, awr.q)) {
            $$6.a($$1, $$3, dtu.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ap.L.a((ard)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dgg $$0, ji $$1) {
      fat $$2 = new fat($$1).c(8.0, 6.0, 8.0);
      List<cgx> $$3 = $$0.a(cgx.class, $$2);
      if (!$$3.isEmpty()) {
         List<cov> $$4 = $$0.a(cov.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cgx $$5 : $$3) {
            if ($$5.O_() == null) {
               cov $$6 = af.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dgg $$0, ji $$1) {
      a($$0, $$1, new cwn(cwr.xA, 3));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cwj $$9 = $$0.h();
         if ($$0.a(cwr.sS)) {
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), avz.bX, awa.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvf.d($$5));
            $$8 = true;
            $$2.a($$4, ebr.M, $$3);
         } else if ($$0.a(cwr.th)) {
            $$0.h(1);
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), avz.cC, awa.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwn(cwr.xD));
            } else if (!$$4.gi().f(new cwn(cwr.xD))) {
               $$4.a(new cwn(cwr.xD), false);
            }

            $$8 = true;
            $$2.a($$4, ebr.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(awj.c.b($$9));
         }
      }

      if ($$8) {
         if (!djz.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dtu.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsi.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dgg $$0, ji $$1) {
      return $$0.c_($$1) instanceof dtu $$3 ? !$$3.c() : false;
   }

   public void a(dgg $$0, dwv $$1, ji $$2, @Nullable cov $$3, dtu.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dtu $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dgg $$0, dwv $$1, ji $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dgg $$0, ji $$1, dwv $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fbs $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jn.a.b);
         if ($$4 >= 1.0 && !$$2.a(awo.ar)) {
            double $$5 = $$3.b(jn.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ji $$6 = $$1.e();
               dwv $$7 = $$0.a_($$6);
               fbs $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jn.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dgg $$0, ji $$1, fbs $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jn.a.a), (double)$$1.u() + $$2.c(jn.a.a), (double)$$1.w() + $$2.b(jn.a.c), (double)$$1.w() + $$2.c(jn.a.c), $$3);
   }

   private void a(dgg $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lt.ax, ayy.d($$0.A.j(), $$1, $$2), $$5, ayy.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dtu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? null : a($$2, dtz.I, dtu::a);
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      if ($$0 instanceof arc $$4 && $$3.b() && $$4.O().b(dgc.h) && $$0.c_($$1) instanceof dtu $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cwn $$9 = new cwn(this);
            $$9.b($$6.q());
            $$9.b(kv.am, cyp.a.a(c, $$7));
            cla $$10 = new cla($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwn> a(dwv $$0, evs.a $$1) {
      buj $$2 = $$1.b(eyj.a);
      if ($$2 instanceof clb || $$2 instanceof cli || $$2 instanceof cqc || $$2 instanceof ckn || $$2 instanceof cri) {
         dtx $$3 = $$1.b(eyj.h);
         if ($$3 instanceof dtu $$4) {
            $$4.a(null, $$0, dtu.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      cwn $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kv.am, cyp.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$1.a_($$5).b() instanceof dml && $$1.c_($$3) instanceof dtu $$9) {
         $$9.a(null, $$0, dtu.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      cyp $$4 = $$0.a(kv.am, cyp.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kv.an, List.of()).size();
      $$2.add(wo.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(wo.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
