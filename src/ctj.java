import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctj extends czl {
   public static final dfz a = dfp.ba;
   public static final dfq b = dfp.a;
   protected static final float c = 5.0F;
   protected static final ehw d = csl.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ehw> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         csl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         csl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         csl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         csl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public ctj(dey.d $$0, dgm $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.c_($$2) instanceof ddt $$6) {
         cix $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bgq.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cbm $$0, egz $$1, ddt $$2, cix $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cij && $$1.b().equals(ha.a);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ha.a, dan.b);
   }

   @Override
   public dez a(clf $$0) {
      cpl $$1 = $$0.q();
      eac $$2 = $$1.b_($$0.a());
      gu $$3 = $$0.a().c();
      dez $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apl.az);
      ha $$6 = ha.a((double)$$0.i());
      boolean $$7 = !csl.a($$4.k($$1, $$3), ha.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbi.a)) {
            ha $$8 = $$4.c(dbi.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<ha> $$9 = dgf.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dgf.a($$6.g()) : dgf.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == ead.c));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ehw $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public ehw b_(dez $$0, cor $$1, gu $$2) {
      return this.a($$0, $$1, $$2, ehi.a());
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dez $$0) {
      return dgf.b($$0.c(a));
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.i, ddt::a);
   }
}
