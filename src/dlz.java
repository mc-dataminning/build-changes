import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlz extends dlr {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final ebf<ja> b = dqg.e;
   public static final ebh c = eax.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)).b(b, ja.c));
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dja $$0, crc $$1, iu $$2, eah $$3, @Nullable dxf $$4, czd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dxc $$6) {
         if (!dfs.a($$5, axe.q)) {
            $$6.a($$1, $$3, dxc.b.c);
            btz.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         ap.L.a((arr)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dja $$0, iu $$1) {
      fel $$2 = new fel($$1).c(8.0, 6.0, 8.0);
      List<civ> $$3 = $$0.a(civ.class, $$2);
      if (!$$3.isEmpty()) {
         List<crc> $$4 = $$0.a(crc.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (civ $$5 : $$3) {
            if ($$5.f() == null) {
               crc $$6 = af.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(dja $$0, iu $$1) {
      a($$0, $$1, new czd(czh.xL, 3));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cyz $$9 = $$0.h();
         if ($$0.a(czh.td)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awn.bX, awo.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bxe.d($$5));
            $$8 = true;
            $$2.a($$4, efh.M, $$3);
         } else if ($$0.a(czh.ts)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awn.cC, awo.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new czd(czh.xO));
            } else if (!$$4.gj().g(new czd(czh.xO))) {
               $$4.a(new czd(czh.xO), false);
            }

            $$8 = true;
            $$2.a($$4, efh.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awx.c.b($$9));
         }
      }

      if ($$8) {
         if (!dmv.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dxc.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bud.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dja $$0, iu $$1) {
      return $$0.c_($$1) instanceof dxc $$3 ? !$$3.c() : false;
   }

   public void a(dja $$0, eah $$1, iu $$2, @Nullable crc $$3, dxc.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dxc $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dja $$0, eah $$1, iu $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dja $$0, iu $$1, eah $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         ffk $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(ja.a.b);
         if ($$4 >= 1.0 && !$$2.a(axc.ar)) {
            double $$5 = $$3.b(ja.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iu $$6 = $$1.e();
               eah $$7 = $$0.a_($$6);
               ffk $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(ja.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dja $$0, iu $$1, ffk $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ja.a.a), (double)$$1.u() + $$2.c(ja.a.a), (double)$$1.w() + $$2.b(ja.a.c), (double)$$1.w() + $$2.c(ja.a.c), $$3);
   }

   private void a(dja $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lx.ay, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? null : a($$2, dxh.I, dxc::a);
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if ($$0 instanceof arq $$4 && $$3.gl() && $$4.O().c(diw.i) && $$0.c_($$1) instanceof dxc $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            czd $$9 = new czd(this);
            $$9.b($$6.q());
            $$9.b(kj.aq, dbd.a.a(c, $$7));
            cnh $$10 = new cnh($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czd> a(eah $$0, ezk.a $$1) {
      bwf $$2 = $$1.b(fcb.a);
      if ($$2 instanceof cni || $$2 instanceof cnp || $$2 instanceof csm || $$2 instanceof cmu || $$2 instanceof cud) {
         dxf $$3 = $$1.b(fcb.h);
         if ($$3 instanceof dxc $$4) {
            $$4.a(null, $$0, dxc.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      czd $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kj.aq, dbd.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$1.a_($$5).b() instanceof dph && $$1.c_($$3) instanceof dxc $$9) {
         $$9.a(null, $$0, dxc.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
