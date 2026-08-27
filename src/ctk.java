import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctk extends czm {
   public static final dga a = dfq.ba;
   public static final dfr b = dfq.a;
   protected static final float c = 5.0F;
   protected static final ehx d = csm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ehx> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         csm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         csm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         csm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         csm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public ctk(dez.d $$0, dgn $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.c_($$2) instanceof ddu $$6) {
         ciy $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bgq.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cbn $$0, eha $$1, ddu $$2, ciy $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cik && $$1.b().equals(ha.a);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ha.a, dao.b);
   }

   @Override
   public dfa a(clg $$0) {
      cpm $$1 = $$0.q();
      ead $$2 = $$1.b_($$0.a());
      gu $$3 = $$0.a().c();
      dfa $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apl.az);
      ha $$6 = ha.a((double)$$0.i());
      boolean $$7 = !csm.a($$4.k($$1, $$3), ha.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbj.a)) {
            ha $$8 = $$4.c(dbj.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<ha> $$9 = dgg.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dgg.a($$6.g()) : dgg.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == eae.c));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ehx $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      return this.a($$0, $$1, $$2, ehj.a());
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfa $$0) {
      return dgg.b($$0.c(a));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.i, ddu::a);
   }
}
