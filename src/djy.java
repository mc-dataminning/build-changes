import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djy extends djq {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dyo<jn> b = dod.e;
   public static final dyq c = dyg.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)).b(b, jn.c));
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dgz $$0, cpr $$1, ji $$2, dxq $$3, @Nullable dus $$4, cxh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dup $$6) {
         if (!ddt.a($$5, aws.q)) {
            $$6.a($$1, $$3, dup.b.c);
            bsu.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         ap.L.a((are)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dgz $$0, ji $$1) {
      fbs $$2 = new fbs($$1).c(8.0, 6.0, 8.0);
      List<chq> $$3 = $$0.a(chq.class, $$2);
      if (!$$3.isEmpty()) {
         List<cpr> $$4 = $$0.a(cpr.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (chq $$5 : $$3) {
            if ($$5.f() == null) {
               cpr $$6 = af.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dgz $$0, ji $$1) {
      a($$0, $$1, new cxh(cxl.xC, 3));
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cxd $$9 = $$0.h();
         if ($$0.a(cxl.sU)) {
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvy.d($$5));
            $$8 = true;
            $$2.a($$4, ecp.M, $$3);
         } else if ($$0.a(cxl.tj)) {
            $$0.h(1);
            $$2.a($$4, $$4.dz(), $$4.dB(), $$4.dF(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cxh(cxl.xF));
            } else if (!$$4.gl().f(new cxh(cxl.xF))) {
               $$4.a(new cxh(cxl.xF), false);
            }

            $$8 = true;
            $$2.a($$4, ecp.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dkt.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dup.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsy.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dgz $$0, ji $$1) {
      return $$0.c_($$1) instanceof dup $$3 ? !$$3.c() : false;
   }

   public void a(dgz $$0, dxq $$1, ji $$2, @Nullable cpr $$3, dup.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dup $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dgz $$0, dxq $$1, ji $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dgz $$0, ji $$1, dxq $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fcr $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jn.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ar)) {
            double $$5 = $$3.b(jn.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ji $$6 = $$1.e();
               dxq $$7 = $$0.a_($$6);
               fcr $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jn.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dgz $$0, ji $$1, fcr $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jn.a.a), (double)$$1.u() + $$2.c(jn.a.a), (double)$$1.w() + $$2.b(jn.a.c), (double)$$1.w() + $$2.c(jn.a.c), $$3);
   }

   private void a(dgz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lt.ay, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dup($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? null : a($$2, duu.I, dup::a);
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if ($$0 instanceof ard $$4 && $$3.gn() && $$4.O().b(dgv.h) && $$0.c_($$1) instanceof dup $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cxh $$9 = new cxh(this);
            $$9.b($$6.q());
            $$9.b(kv.ao, czh.a.a(c, $$7));
            clw $$10 = new clw($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxh> a(dxq $$0, ewr.a $$1) {
      bva $$2 = $$1.b(ezi.a);
      if ($$2 instanceof clx || $$2 instanceof cme || $$2 instanceof cqy || $$2 instanceof clj || $$2 instanceof cse) {
         dus $$3 = $$1.b(ezi.h);
         if ($$3 instanceof dup $$4) {
            $$4.a(null, $$0, dup.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      cxh $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kv.ao, czh.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$1.a_($$5).b() instanceof dnf && $$1.c_($$3) instanceof dup $$9) {
         $$9.a(null, $$0, dup.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      czh $$4 = $$0.a(kv.ao, czh.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kv.ap, List.of()).size();
      $$2.add(wp.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(wp.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
