import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dlo extends diz implements dqt {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final akv b = akv.b("sherds");
   private static final fbv d = djn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dxv<jn> e = dxo.U;
   public static final dxp c = dxo.bz;
   private static final dxp f = dxo.J;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jn.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == etb.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.c_($$3) instanceof dur $$7) {
         if ($$2.C) {
            return bsl.a;
         } else {
            cwq $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwq.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dur.a.a);
               $$4.b(awk.c.b($$0.h()));
               cwq $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awa.gT, awb.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof ard $$13) {
                  $$13.a(lt.aZ, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ebu.c, $$3);
               return bsl.a;
            } else {
               return bsl.f;
            }
         }
      } else {
         return bsl.e;
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1.c_($$2) instanceof dur $$5) {
         $$1.a(null, $$2, awa.gU, awb.e, 1.0F, 1.0F);
         $$5.a(dur.a.b);
         $$1.a($$3, ebu.c, $$2);
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dur($$0, $$1);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwq> a(dwy $$0, evv.a $$1) {
      dua $$2 = $$1.b(eym.h);
      if ($$2 instanceof dur $$3) {
         $$1.a(b, $$1x -> {
            for (cwm $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      cwq $$4 = $$3.eZ();
      dwy $$5 = $$2;
      if ($$4.a(awy.bL) && !ddc.a($$4, aws.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(f) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected drf h_(dwy $$0) {
      return $$0.c(c) ? drf.bc : drf.bb;
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvh $$4 = $$0.a(kv.ak, dvh.a);
      if (!$$4.equals(dvh.a)) {
         $$2.add(wo.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwq($$1x.orElse(cwu.rs), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dur $$4) {
         dvh $$5 = $$4.s();
         return dur.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
