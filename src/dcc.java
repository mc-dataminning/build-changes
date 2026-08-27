import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcc extends czo implements dhc {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final ajh b = new ajh("sherds");
   private static final eqm d = dac.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dnv e = dnr.R;
   public static final dns c = dnr.bw;
   private static final dns f = dnr.C;

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   protected dcc(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ih.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eiq.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.c_($$3) instanceof dky $$7) {
         if ($$2.B) {
            return bnf.b;
         } else {
            cqm $$9 = $$7.f();
            if (!$$0.b() && ($$9.b() || cqm.c($$9, $$0) && $$9.M() < $$9.g())) {
               $$7.a(dky.b.a);
               $$4.b(aui.c.b($$0.d()));
               cqm $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.ai_()) {
                  $$7.a($$10);
                  $$11 = (float)$$10.M() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.g();
               }

               $$2.a(null, $$3, aty.gs, atz.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof apf $$13) {
                  $$13.a(kc.aV, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, drp.c, $$3);
               return bnf.a;
            } else {
               return bnf.d;
            }
         }
      } else {
         return bnf.e;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.c_($$2) instanceof dky $$5) {
         $$1.a(null, $$2, aty.gt, atz.e, 1.0F, 1.0F);
         $$5.a(dky.b.b);
         $$1.a($$3, drp.c, $$2);
         return bnd.a;
      } else {
         return bnd.d;
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      if ($$0.B) {
         $$0.a($$1, dkk.O).ifPresent($$1x -> $$1x.b($$4));
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return d;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dky($$0, $$1);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cqm> a(dnb $$0, elc.a $$1) {
      dki $$2 = $$1.b(enh.h);
      if ($$2 instanceof dky $$3) {
         $$1.a(b, $$1x -> $$3.l().a().map(cqh::am_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      cqm $$4 = $$3.eU();
      dnb $$5 = $$2;
      if ($$4.a(auv.aY) && !cux.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(f) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dho h_(dnb $$0) {
      return $$0.c(c) ? dho.bc : dho.bb;
   }

   @Override
   public void a(cqm $$0, @Nullable cwh $$1, List<vu> $$2, csd $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dky.a $$5 = dky.a.b(coh.a($$0));
      if (!$$5.equals(dky.a.a)) {
         $$2.add(vt.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new cqm($$1x, 1).z().e().a(n.h)));
      }
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return $$0.c_($$1) instanceof dky $$3 ? $$3.s() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }
}
