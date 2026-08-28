import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dlm extends dix implements dqr {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final akv b = akv.b("sherds");
   private static final fbt d = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dxt<jn> e = dxm.U;
   public static final dxn c = dxm.bz;
   private static final dxn f = dxm.J;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jn.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == esz.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$2.c_($$3) instanceof dup $$7) {
         if ($$2.C) {
            return bsj.a;
         } else {
            cwo $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwo.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dup.a.a);
               $$4.b(awk.c.b($$0.h()));
               cwo $$10 = $$0.b(1, $$4);
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
               $$2.a($$4, ebs.c, $$3);
               return bsj.a;
            } else {
               return bsj.f;
            }
         }
      } else {
         return bsj.e;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1.c_($$2) instanceof dup $$5) {
         $$1.a(null, $$2, awa.gU, awb.e, 1.0F, 1.0F);
         $$5.a(dup.a.b);
         $$1.a($$3, ebs.c, $$2);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dup($$0, $$1);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwo> a(dww $$0, evt.a $$1) {
      dty $$2 = $$1.b(eyk.h);
      if ($$2 instanceof dup $$3) {
         $$1.a(b, $$1x -> {
            for (cwk $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      cwo $$4 = $$3.eZ();
      dww $$5 = $$2;
      if ($$4.a(awy.bL) && !dda.a($$4, aws.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(f) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected drd h_(dww $$0) {
      return $$0.c(c) ? drd.bc : drd.bb;
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvf $$4 = $$0.a(kv.ak, dvf.a);
      if (!$$4.equals(dvf.a)) {
         $$2.add(wo.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwo($$1x.orElse(cws.rs), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dup $$4) {
         dvf $$5 = $$4.s();
         return dup.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
