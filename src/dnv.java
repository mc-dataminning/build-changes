import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnv extends dlg implements dtb {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final ale b = ale.b("sherds");
   public static final eam<ja> c = eae.T;
   public static final eaf d = eae.bz;
   public static final eaf e = eae.I;
   private static final feq f = dlu.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, ja.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == evw.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.c_($$3) instanceof dxf $$7) {
         if ($$2.C) {
            return bty.a;
         } else {
            cys $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cys.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dxf.a.a);
               $$4.b(awv.c.b($$0.h()));
               cys $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awl.gT, awm.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aro $$13) {
                  $$13.a(lx.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eeo.c, $$3);
               return bty.a;
            } else {
               return bty.f;
            }
         }
      } else {
         return bty.e;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.c_($$2) instanceof dxf $$5) {
         $$1.a(null, $$2, awl.gU, awm.e, 1.0F, 1.0F);
         $$5.a(dxf.a.b);
         $$1.a($$3, eeo.c, $$2);
         return bty.a;
      } else {
         return bty.e;
      }
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxf($$0, $$1);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected List<cys> a(dzo $$0, eyq.a $$1) {
      dwn $$2 = $$1.b(fbh.h);
      if ($$2 instanceof dxf $$3) {
         $$1.a(b, $$1x -> {
            for (cyo $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      cys $$4 = $$3.fa();
      dzo $$5 = $$2;
      if ($$4.a(axi.bL) && !dfh.a($$4, axc.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(e) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtn h_(dzo $$0) {
      return $$0.c(d) ? dtn.bd : dtn.bc;
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof aro $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dxf $$4) {
         dxv $$5 = $$4.s();
         return dxf.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
