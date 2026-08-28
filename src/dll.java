import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dll extends diw implements dqq {
   public static final MapCodec<dll> a = b(dll::new);
   public static final aku b = aku.b("sherds");
   private static final fbs d = djk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dxs<jn> e = dxl.U;
   public static final dxm c = dxl.bz;
   private static final dxm f = dxl.J;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   protected dll(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jn.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == esy.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.c_($$3) instanceof duo $$7) {
         if ($$2.C) {
            return bsi.a;
         } else {
            cwn $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwn.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(duo.a.a);
               $$4.b(awj.c.b($$0.h()));
               cwn $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, avz.gT, awa.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arc $$13) {
                  $$13.a(lt.aZ, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ebr.c, $$3);
               return bsi.a;
            } else {
               return bsi.f;
            }
         }
      } else {
         return bsi.e;
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1.c_($$2) instanceof duo $$5) {
         $$1.a(null, $$2, avz.gU, awa.e, 1.0F, 1.0F);
         $$5.a(duo.a.b);
         $$1.a($$3, ebr.c, $$2);
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new duo($$0, $$1);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwn> a(dwv $$0, evs.a $$1) {
      dtx $$2 = $$1.b(eyj.h);
      if ($$2 instanceof duo $$3) {
         $$1.a(b, $$1x -> {
            for (cwj $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      cwn $$4 = $$3.eZ();
      dwv $$5 = $$2;
      if ($$4.a(awx.bL) && !dcz.a($$4, awr.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(f) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected drc h_(dwv $$0) {
      return $$0.c(c) ? drc.bc : drc.bb;
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dve $$4 = $$0.a(kv.ak, dve.a);
      if (!$$4.equals(dve.a)) {
         $$2.add(wn.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwn($$1x.orElse(cwr.rs), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof arc $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof duo $$4) {
         dve $$5 = $$4.s();
         return duo.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
