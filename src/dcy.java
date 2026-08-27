import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dcy extends dcq {
   public static final MapCodec<dcy> a = b(dcy::new);
   public static final drb b = dha.aE;
   public static final drh c = dqx.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, is.c));
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dad $$0, clh $$1, in $$2, dqh $$3, @Nullable dnm $$4, csz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dnj $$6) {
         if (cyh.a(cyj.v, $$5) == 0) {
            $$6.a($$1, $$3, dnj.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aqi)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dad $$0, in $$1) {
      etk $$2 = new etk($$1).c(8.0, 6.0, 8.0);
      List<cdq> $$3 = $$0.a(cdq.class, $$2);
      if (!$$3.isEmpty()) {
         List<clh> $$4 = $$0.a(clh.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cdq $$5 : $$3) {
            if ($$5.p() == null) {
               clh $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dad $$0, in $$1) {
      a($$0, $$1, new csz(ctc.ww, 3));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         csu $$9 = $$0.f();
         if ($$0.a(ctc.rV)) {
            $$2.a($$4, $$4.ds(), $$4.du(), $$4.dy(), avc.bX, avd.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bsa.d($$5));
            $$8 = true;
            $$2.a($$4, dva.M, $$3);
         } else if ($$0.a(ctc.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.ds(), $$4.du(), $$4.dy(), avc.cC, avd.e, 1.0F, 1.0F);
            if ($$0.d()) {
               $$4.a($$5, new csz(ctc.wz));
            } else if (!$$4.ga().f(new csz(ctc.wz))) {
               $$4.a(new csz(ctc.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dva.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avm.c.b($$9));
         }
      }

      if ($$8) {
         if (!dds.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dnj.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bpo.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dad $$0, in $$1) {
      return $$0.c_($$1) instanceof dnj $$3 ? !$$3.c() : false;
   }

   public void a(dad $$0, dqh $$1, in $$2, @Nullable clh $$3, dnj.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dnj $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dad $$0, dqh $$1, in $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dad $$0, in $$1, dqh $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eui $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(is.a.b);
         if ($$4 >= 1.0 && !$$2.a(avr.ao)) {
            double $$5 = $$3.b(is.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               in $$6 = $$1.d();
               dqh $$7 = $$0.a_($$6);
               eui $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(is.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dad $$0, in $$1, eui $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(is.a.a), (double)$$1.u() + $$2.c(is.a.a), (double)$$1.w() + $$2.b(is.a.c), (double)$$1.w() + $$2.c(is.a.c), $$3);
   }

   private void a(dad $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kx.as, axz.d($$0.z.j(), $$1, $$2), $$5, axz.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? null : a($$2, dno.H, dnj::a);
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.B && $$3.f() && $$0.aa().b(czz.h) && $$0.c_($$1) instanceof dnj $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            csz $$8 = new csz(this);
            $$8.a($$5.s());
            $$8.b(ka.Y, cvi.a.a(c, $$6));
            chr $$9 = new chr($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<csz> a(dqh $$0, eoo.a $$1) {
      brh $$2 = $$1.b(erc.a);
      if ($$2 instanceof chs || $$2 instanceof chz || $$2 instanceof cmn || $$2 instanceof chf || $$2 instanceof cno) {
         dnm $$3 = $$1.b(erc.h);
         if ($$3 instanceof dnj $$4) {
            $$4.a(null, $$0, dnj.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$3.a_($$5).b() instanceof dge && $$3.c_($$4) instanceof dnj $$7) {
         $$7.a(null, $$0, dnj.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
