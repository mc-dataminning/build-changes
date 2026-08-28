import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djh extends diz {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dxv<jn> b = dnl.aF;
   public static final dxx c = dxo.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jn.c));
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dgj $$0, coy $$1, ji $$2, dwy $$3, @Nullable dua $$4, cwq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dtx $$6) {
         if (!ddc.a($$5, aws.q)) {
            $$6.a($$1, $$3, dtx.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ap.L.a((are)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dgj $$0, ji $$1) {
      faw $$2 = new faw($$1).c(8.0, 6.0, 8.0);
      List<cha> $$3 = $$0.a(cha.class, $$2);
      if (!$$3.isEmpty()) {
         List<coy> $$4 = $$0.a(coy.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cha $$5 : $$3) {
            if ($$5.O_() == null) {
               coy $$6 = af.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dgj $$0, ji $$1) {
      a($$0, $$1, new cwq(cwu.xA, 3));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cwm $$9 = $$0.h();
         if ($$0.a(cwu.sS)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bvi.d($$5));
            $$8 = true;
            $$2.a($$4, ebu.M, $$3);
         } else if ($$0.a(cwu.th)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cwq(cwu.xD));
            } else if (!$$4.gi().f(new cwq(cwu.xD))) {
               $$4.a(new cwq(cwu.xD), false);
            }

            $$8 = true;
            $$2.a($$4, ebu.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dkc.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dtx.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bsl.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dgj $$0, ji $$1) {
      return $$0.c_($$1) instanceof dtx $$3 ? !$$3.c() : false;
   }

   public void a(dgj $$0, dwy $$1, ji $$2, @Nullable coy $$3, dtx.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dtx $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dgj $$0, dwy $$1, ji $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dgj $$0, ji $$1, dwy $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fbv $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jn.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ar)) {
            double $$5 = $$3.b(jn.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ji $$6 = $$1.e();
               dwy $$7 = $$0.a_($$6);
               fbv $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jn.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dgj $$0, ji $$1, fbv $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jn.a.a), (double)$$1.u() + $$2.c(jn.a.a), (double)$$1.w() + $$2.b(jn.a.c), (double)$$1.w() + $$2.c(jn.a.c), $$3);
   }

   private void a(dgj $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lt.ax, ayz.d($$0.A.j(), $$1, $$2), $$5, ayz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dtx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? null : a($$2, duc.I, dtx::a);
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if ($$0 instanceof ard $$4 && $$3.b() && $$4.O().b(dgf.h) && $$0.c_($$1) instanceof dtx $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cwq $$9 = new cwq(this);
            $$9.b($$6.q());
            $$9.b(kv.am, cys.a.a(c, $$7));
            cld $$10 = new cld($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwq> a(dwy $$0, evv.a $$1) {
      bum $$2 = $$1.b(eym.a);
      if ($$2 instanceof cle || $$2 instanceof cll || $$2 instanceof cqf || $$2 instanceof ckq || $$2 instanceof crl) {
         dua $$3 = $$1.b(eym.h);
         if ($$3 instanceof dtx $$4) {
            $$4.a(null, $$0, dtx.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      cwq $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kv.am, cys.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$1.a_($$5).b() instanceof dmo && $$1.c_($$3) instanceof dtx $$9) {
         $$9.a(null, $$0, dtx.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      cys $$4 = $$0.a(kv.am, cys.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(kv.an, List.of()).size();
      $$2.add(wp.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(wp.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
