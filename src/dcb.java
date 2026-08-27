import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dcb extends dbt {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final dqc b = dgc.aE;
   public static final dqi c = dpy.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ij.c));
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(czg $$0, cka $$1, id $$2, dpi $$3, @Nullable dmo $$4, crs $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dml $$6) {
         if (cxa.a(cxc.v, $$5) == 0) {
            $$6.a($$1, $$3, dml.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((apv)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(czg $$0, id $$1) {
      ese $$2 = new ese($$1).c(8.0, 6.0, 8.0);
      List<ccj> $$3 = $$0.a(ccj.class, $$2);
      if (!$$3.isEmpty()) {
         List<cka> $$4 = $$0.a(cka.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (ccj $$5 : $$3) {
            if ($$5.p() == null) {
               cka $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(czg $$0, id $$1) {
      a($$0, $$1, new crs(crv.ws, 3));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         crn $$9 = $$0.f();
         if ($$0.a(crv.rU)) {
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), auo.bX, aup.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bqt.d($$5));
            $$8 = true;
            $$2.a($$4, dub.M, $$3);
         } else if ($$0.a(crv.sk)) {
            $$0.g(1);
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), auo.cC, aup.e, 1.0F, 1.0F);
            if ($$0.d()) {
               $$4.a($$5, new crs(crv.wv));
            } else if (!$$4.fZ().e(new crs(crv.wv))) {
               $$4.a(new crs(crv.wv), false);
            }

            $$8 = true;
            $$2.a($$4, dub.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(auz.c.b($$9));
         }
      }

      if ($$8) {
         if (!dcv.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dml.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return boh.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(czg $$0, id $$1) {
      return $$0.c_($$1) instanceof dml $$3 ? !$$3.c() : false;
   }

   public void a(czg $$0, dpi $$1, id $$2, @Nullable cka $$3, dml.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dml $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(czg $$0, dpi $$1, id $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(czg $$0, id $$1, dpi $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         etc $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ij.a.b);
         if ($$4 >= 1.0 && !$$2.a(ave.ao)) {
            double $$5 = $$3.b(ij.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               id $$6 = $$1.d();
               dpi $$7 = $$0.a_($$6);
               etc $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ij.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(czg $$0, id $$1, etc $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ij.a.a), (double)$$1.u() + $$2.c(ij.a.a), (double)$$1.w() + $$2.b(ij.a.c), (double)$$1.w() + $$2.c(ij.a.c), $$3);
   }

   private void a(czg $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kn.at, axm.d($$0.z.j(), $$1, $$2), $$5, axm.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dml($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? null : a($$2, dmq.H, dml::a);
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.B && $$3.f() && $$0.aa().b(czc.h) && $$0.c_($$1) instanceof dml $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            crs $$8 = new crs(this);
            $$8.a($$5.s());
            $$8.b(jr.R, ctz.a.a(c, $$6));
            cgk $$9 = new cgk($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<crs> a(dpi $$0, enq.a $$1) {
      bqa $$2 = $$1.b(epx.a);
      if ($$2 instanceof cgl || $$2 instanceof cgs || $$2 instanceof clg || $$2 instanceof cfy || $$2 instanceof cmh) {
         dmo $$3 = $$1.b(epx.h);
         if ($$3 instanceof dml $$4) {
            $$4.a(null, $$0, dml.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$3.a_($$5).b() instanceof dfh && $$3.c_($$4) instanceof dml $$7) {
         $$7.a(null, $$0, dml.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
