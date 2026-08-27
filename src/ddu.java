import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ddu extends ddm {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final drx b = dhw.aE;
   public static final dsd c = drt.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, it.c));
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(daz $$0, cly $$1, io $$2, drd $$3, @Nullable doi $$4, ctq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dof $$6) {
         if (czc.a(cze.v, $$5) == 0) {
            $$6.a($$1, $$3, dof.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aqo)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(daz $$0, io $$1) {
      euh $$2 = new euh($$1).c(8.0, 6.0, 8.0);
      List<ceh> $$3 = $$0.a(ceh.class, $$2);
      if (!$$3.isEmpty()) {
         List<cly> $$4 = $$0.a(cly.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (ceh $$5 : $$3) {
            if ($$5.p() == null) {
               cly $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(daz $$0, io $$1) {
      a($$0, $$1, new ctq(ctt.ww, 3));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         ctl $$9 = $$0.g();
         if ($$0.a(ctt.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avi.bX, avj.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bsq.d($$5));
            $$8 = true;
            $$2.a($$4, dvw.M, $$3);
         } else if ($$0.a(ctt.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avi.cC, avj.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new ctq(ctt.wz));
            } else if (!$$4.gc().f(new ctq(ctt.wz))) {
               $$4.a(new ctq(ctt.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dvw.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avs.c.b($$9));
         }
      }

      if ($$8) {
         if (!deo.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dof.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bpy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(daz $$0, io $$1) {
      return $$0.c_($$1) instanceof dof $$3 ? !$$3.c() : false;
   }

   public void a(daz $$0, drd $$1, io $$2, @Nullable cly $$3, dof.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dof $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(daz $$0, drd $$1, io $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(daz $$0, io $$1, drd $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         evf $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(it.a.b);
         if ($$4 >= 1.0 && !$$2.a(avx.ao)) {
            double $$5 = $$3.b(it.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               io $$6 = $$1.d();
               drd $$7 = $$0.a_($$6);
               evf $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(it.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(daz $$0, io $$1, evf $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(it.a.a), (double)$$1.u() + $$2.c(it.a.a), (double)$$1.w() + $$2.b(it.a.c), (double)$$1.w() + $$2.c(it.a.c), $$3);
   }

   private void a(daz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ky.av, ayf.d($$0.z.j(), $$1, $$2), $$5, ayf.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dof($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? null : a($$2, dok.H, dof::a);
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.B && $$3.f() && $$0.aa().b(dav.h) && $$0.c_($$1) instanceof dof $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            ctq $$8 = new ctq(this);
            $$8.a($$5.s());
            $$8.b(kb.aa, cwb.a.a(c, $$6));
            cii $$9 = new cii($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<ctq> a(drd $$0, epk.a $$1) {
      brw $$2 = $$1.b(erz.a);
      if ($$2 instanceof cij || $$2 instanceof ciq || $$2 instanceof cne || $$2 instanceof chw || $$2 instanceof cof) {
         doi $$3 = $$1.b(erz.h);
         if ($$3 instanceof dof $$4) {
            $$4.a(null, $$0, dof.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$3.a_($$5).b() instanceof dha && $$3.c_($$4) instanceof dof $$7) {
         $$7.a(null, $$0, dof.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
