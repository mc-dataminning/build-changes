import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dln extends diy implements dqs {
   public static final MapCodec<dln> a = b(dln::new);
   public static final aku b = aku.b("sherds");
   private static final fbu d = djm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dxu<jn> e = dxn.U;
   public static final dxo c = dxn.bz;
   private static final dxo f = dxn.J;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   protected dln(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jn.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == eta.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$2.c_($$3) instanceof duq $$7) {
         if ($$2.C) {
            return bsj.a;
         } else {
            cwp $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwp.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(duq.a.a);
               $$4.b(awk.c.b($$0.h()));
               cwp $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awa.gT, awb.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arc $$13) {
                  $$13.a(lt.aZ, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ebt.c, $$3);
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
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1.c_($$2) instanceof duq $$5) {
         $$1.a(null, $$2, awa.gU, awb.e, 1.0F, 1.0F);
         $$5.a(duq.a.b);
         $$1.a($$3, ebt.c, $$2);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return d;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duq($$0, $$1);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwp> a(dwx $$0, evu.a $$1) {
      dtz $$2 = $$1.b(eyl.h);
      if ($$2 instanceof duq $$3) {
         $$1.a(b, $$1x -> {
            for (cwl $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      cwp $$4 = $$3.eZ();
      dwx $$5 = $$2;
      if ($$4.a(awy.bM) && !ddb.a($$4, aws.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(f) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected dre h_(dwx $$0) {
      return $$0.c(c) ? dre.bc : dre.bb;
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvg $$4 = $$0.a(kv.ak, dvg.a);
      if (!$$4.equals(dvg.a)) {
         $$2.add(wn.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwp($$1x.orElse(cwt.rs), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof arc $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof duq $$4) {
         dvg $$5 = $$4.s();
         return duq.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.b;
   }
}
