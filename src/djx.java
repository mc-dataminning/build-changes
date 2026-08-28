import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djx extends djp {
   public static final MapCodec<djx> a = b(djx::new);
   public static final dyl<jm> b = dob.aF;
   public static final dyn c = dye.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dgz $$0, cpo $$1, jh $$2, dxo $$3, @Nullable duq $$4, cxg $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dun $$6) {
         if (!dds.a($$5, axn.q)) {
            $$6.a($$1, $$3, dun.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((ary)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dgz $$0, jh $$1) {
      fbm $$2 = new fbm($$1).c(8.0, 6.0, 8.0);
      List<chp> $$3 = $$0.a(chp.class, $$2);
      if (!$$3.isEmpty()) {
         List<cpo> $$4 = $$0.a(cpo.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (chp $$5 : $$3) {
            if ($$5.O_() == null) {
               cpo $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dgz $$0, jh $$1) {
      a($$0, $$1, new cxg(cxk.xA, 3));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cxc $$9 = $$0.h();
         if ($$0.a(cxk.sS)) {
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), awv.bX, aww.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvx.d($$5));
            $$8 = true;
            $$2.a($$4, eck.M, $$3);
         } else if ($$0.a(cxk.th)) {
            $$0.h(1);
            $$2.a($$4, $$4.dB(), $$4.dD(), $$4.dH(), awv.cC, aww.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cxg(cxk.xD));
            } else if (!$$4.gi().f(new cxg(cxk.xD))) {
               $$4.a(new cxg(cxk.xD), false);
            }

            $$8 = true;
            $$2.a($$4, eck.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(axf.c.b($$9));
         }
      }

      if ($$8) {
         if (!dks.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dun.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bta.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dgz $$0, jh $$1) {
      return $$0.c_($$1) instanceof dun $$3 ? !$$3.c() : false;
   }

   public void a(dgz $$0, dxo $$1, jh $$2, @Nullable cpo $$3, dun.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dun $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dgz $$0, dxo $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dgz $$0, jh $$1, dxo $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fcl $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axk.ar)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dxo $$7 = $$0.a_($$6);
               fcl $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dgz $$0, jh $$1, fcl $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dgz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ls.ax, azu.d($$0.A.j(), $$1, $$2), $$5, azu.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? null : a($$2, dus.I, dun::a);
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if ($$0 instanceof arx $$4 && $$3.b() && $$4.O().b(dgv.h) && $$0.c_($$1) instanceof dun $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cxg $$9 = new cxg(this);
            $$9.b($$6.q());
            $$9.b(ku.am, czi.a.a(c, $$7));
            cls $$10 = new cls($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxg> a(dxo $$0, ewl.a $$1) {
      bvb $$2 = $$1.b(ezc.a);
      if ($$2 instanceof clt || $$2 instanceof cma || $$2 instanceof cqv || $$2 instanceof clf || $$2 instanceof csb) {
         duq $$3 = $$1.b(ezc.h);
         if ($$3 instanceof dun $$4) {
            $$4.a(null, $$0, dun.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$1.a_($$5).b() instanceof dne && $$1.c_($$3) instanceof dun $$9) {
         $$9.a(null, $$0, dun.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      czi $$4 = $$0.a(ku.am, czi.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xk.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xk.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
