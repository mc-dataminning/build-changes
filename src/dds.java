import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dds extends ddk {
   public static final MapCodec<dds> a = b(dds::new);
   public static final drv b = dhu.aE;
   public static final dsb c = drr.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public dds(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, it.c));
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dax $$0, clw $$1, io $$2, drb $$3, @Nullable dog $$4, cto $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dod $$6) {
         if (cza.a(czc.v, $$5) == 0) {
            $$6.a($$1, $$3, dod.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aqn)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dax $$0, io $$1) {
      euf $$2 = new euf($$1).c(8.0, 6.0, 8.0);
      List<cef> $$3 = $$0.a(cef.class, $$2);
      if (!$$3.isEmpty()) {
         List<clw> $$4 = $$0.a(clw.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cef $$5 : $$3) {
            if ($$5.p() == null) {
               clw $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dax $$0, io $$1) {
      a($$0, $$1, new cto(ctr.ww, 3));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         ctj $$9 = $$0.g();
         if ($$0.a(ctr.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avh.bX, avi.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bso.d($$5));
            $$8 = true;
            $$2.a($$4, dvu.M, $$3);
         } else if ($$0.a(ctr.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avh.cC, avi.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cto(ctr.wz));
            } else if (!$$4.gc().f(new cto(ctr.wz))) {
               $$4.a(new cto(ctr.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dvu.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avr.c.b($$9));
         }
      }

      if ($$8) {
         if (!dem.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dod.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bpw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dax $$0, io $$1) {
      return $$0.c_($$1) instanceof dod $$3 ? !$$3.c() : false;
   }

   public void a(dax $$0, drb $$1, io $$2, @Nullable clw $$3, dod.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dod $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dax $$0, drb $$1, io $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dax $$0, io $$1, drb $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         evd $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(it.a.b);
         if ($$4 >= 1.0 && !$$2.a(avw.ao)) {
            double $$5 = $$3.b(it.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               io $$6 = $$1.d();
               drb $$7 = $$0.a_($$6);
               evd $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(it.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dax $$0, io $$1, evd $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(it.a.a), (double)$$1.u() + $$2.c(it.a.a), (double)$$1.w() + $$2.b(it.a.c), (double)$$1.w() + $$2.c(it.a.c), $$3);
   }

   private void a(dax $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ky.av, ayd.d($$0.z.j(), $$1, $$2), $$5, ayd.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dod($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? null : a($$2, doi.H, dod::a);
   }

   @Override
   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
      if (!$$0.B && $$3.f() && $$0.aa().b(dat.h) && $$0.c_($$1) instanceof dod $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cto $$8 = new cto(this);
            $$8.a($$5.s());
            $$8.b(kb.aa, cvz.a.a(c, $$6));
            cig $$9 = new cig($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cto> a(drb $$0, epi.a $$1) {
      bru $$2 = $$1.b(erx.a);
      if ($$2 instanceof cih || $$2 instanceof cio || $$2 instanceof cnc || $$2 instanceof chu || $$2 instanceof cod) {
         dog $$3 = $$1.b(erx.h);
         if ($$3 instanceof dod $$4) {
            $$4.a(null, $$0, dod.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$3.a_($$5).b() instanceof dgy && $$3.c_($$4) instanceof dod $$7) {
         $$7.a(null, $$0, dod.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
