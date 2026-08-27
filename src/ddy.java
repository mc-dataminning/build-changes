import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddy extends dbk implements diy {
   public static final MapCodec<ddy> a = b(ddy::new);
   public static final ajt b = new ajt("sherds");
   private static final est d = dby.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dpt e = dpp.R;
   public static final dpq c = dpp.bw;
   private static final dpq f = dpp.C;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   protected ddy(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ih.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ekt.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.c_($$3) instanceof dmv $$7) {
         if ($$2.B) {
            return boc.b;
         } else {
            crj $$9 = $$7.f();
            if (!$$0.d() && ($$9.d() || crj.c($$9, $$0) && $$9.G() < $$9.i())) {
               $$7.a(dmv.a.a);
               $$4.b(auw.c.b($$0.f()));
               crj $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.ah_()) {
                  $$7.a($$10);
                  $$11 = (float)$$10.G() / (float)$$10.i();
               } else {
                  $$9.f(1);
                  $$11 = (float)$$9.G() / (float)$$9.i();
               }

               $$2.a(null, $$3, aum.gt, aun.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aps $$13) {
                  $$13.a(kl.aV, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dts.c, $$3);
               return boc.a;
            } else {
               return boc.d;
            }
         }
      } else {
         return boc.e;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.c_($$2) instanceof dmv $$5) {
         $$1.a(null, $$2, aum.gu, aun.e, 1.0F, 1.0F);
         $$5.a(dmv.a.b);
         $$1.a($$3, dts.c, $$2);
         return boa.a;
      } else {
         return boa.d;
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmv($$0, $$1);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<crj> a(doz $$0, enh.a $$1) {
      dmf $$2 = $$1.b(epo.h);
      if ($$2 instanceof dmv $$3) {
         $$1.a(b, $$1x -> {
            for (cre $$2x : $$3.l().a()) {
               $$1x.accept($$2x.x());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      crj $$4 = $$3.eU();
      doz $$5 = $$2;
      if ($$4.a(avk.aY) && !cwr.g($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(f) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected djk h_(doz $$0) {
      return $$0.c(c) ? djk.bc : djk.bb;
   }

   @Override
   public void a(crj $$0, @Nullable cyd $$1, List<wg> $$2, csz $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dnj $$5 = $$0.a(jp.P, dnj.a);
      if (!$$5.equals(dnj.a)) {
         $$2.add(wf.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new crj($$1x.orElse(crm.qK), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return $$0.c_($$1) instanceof dmv $$3 ? $$3.t() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
   }
}
