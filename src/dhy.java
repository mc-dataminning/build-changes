import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhy extends dfk implements dna {
   public static final MapCodec<dhy> a = b(dhy::new);
   public static final akr b = akr.b("sherds");
   private static final exv d = dfy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dtw e = dts.R;
   public static final dtt c = dts.bw;
   private static final dtt f = dts.C;

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   protected dhy(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ji.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == epf.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if ($$2.c_($$3) instanceof dqx $$7) {
         if ($$2.B) {
            return bqt.b;
         } else {
            cuq $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cuq.c($$9, $$0) && $$9.H() < $$9.j())) {
               $$7.a(dqx.a.a);
               $$4.b(avz.c.b($$0.g()));
               cuq $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.H() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.H() / (float)$$9.j();
               }

               $$2.a(null, $$3, avp.gy, avq.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqu $$13) {
                  $$13.a(lm.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dxz.c, $$3);
               return bqt.a;
            } else {
               return bqt.d;
            }
         }
      } else {
         return bqt.e;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.c_($$2) instanceof dqx $$5) {
         $$1.a(null, $$2, avp.gz, avq.e, 1.0F, 1.0F);
         $$5.a(dqx.a.b);
         $$1.a($$3, dxz.c, $$2);
         return bqr.a;
      } else {
         return bqr.e;
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return d;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqx($$0, $$1);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      bqn.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuq> a(dtc $$0, eru.a $$1) {
      dqh $$2 = $$1.b(eun.h);
      if ($$2 instanceof dqx $$3) {
         $$1.a(b, $$1x -> {
            for (cul $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      cuq $$4 = $$3.eT();
      dtc $$5 = $$2;
      if ($$4.a(awn.bv) && !dae.a($$4, awh.r)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dnm g_(dtc $$0) {
      return $$0.c(c) ? dnm.bc : dnm.bb;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      drm $$4 = $$0.a(kq.aa, drm.a);
      if (!$$4.equals(drm.a)) {
         $$2.add(wy.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cuq($$1x.orElse(cut.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dcw $$0, dtc $$1, ewy $$2, cnp $$3) {
      jd $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return $$0.c_($$1) instanceof dqx $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
