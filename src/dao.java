import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dao extends cya implements dfo {
   public static final MapCodec<dao> a = b(dao::new);
   public static final aiy b = new aiy("sherds");
   private static final eol d = cyo.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dlz e = dlv.R;
   public static final dlw c = dlv.bw;
   private static final dlw f = dlv.C;

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   protected dao(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ie.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == egq.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.c_($$3) instanceof djj $$7) {
         if ($$2.B) {
            return blw.b;
         } else {
            coz $$9 = $$7.x();
            if (!$$0.b() && ($$9.b() || coz.c($$9, $$0) && $$9.M() < $$9.g())) {
               $$7.a(djj.b.a);
               $$4.b(atu.c.b($$0.d()));
               coz $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.aj_()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.g();
               }

               $$2.a(null, $$3, atk.gk, atl.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aov $$13) {
                  $$13.a(jz.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dpp.c, $$3);
               return blw.a;
            } else {
               return blw.d;
            }
         }
      } else {
         return blw.e;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.c_($$2) instanceof djj $$5) {
         $$1.a(null, $$2, atk.gl, atl.e, 1.0F, 1.0F);
         $$5.a(djj.b.b);
         $$1.a($$3, dpp.c, $$2);
         return blu.a;
      } else {
         return blu.d;
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      if ($$0.B) {
         $$0.a($$1, div.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djj($$0, $$1);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      blq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<coz> a(dlf $$0, ejb.a $$1) {
      dit $$2 = $$1.b(elg.h);
      if ($$2 instanceof djj $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(cou::ao_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      coz $$4 = $$3.eT();
      dlf $$5 = $$2;
      if ($$4.a(auh.aY) && !ctj.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(f) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dga h_(dlf $$0) {
      return $$0.c(c) ? dga.bc : dga.bb;
   }

   @Override
   public void a(coz $$0, @Nullable cut $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      djj.a $$4 = djj.a.b(cms.a($$0));
      if (!$$4.equals(djj.a.a)) {
         $$2.add(vp.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new coz($$1x, 1).z().e().a(n.h)));
      }
   }

   @Override
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      hz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return $$0.c_($$1) instanceof djj $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.a($$1.c_($$2));
   }
}
