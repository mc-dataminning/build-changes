import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cql extends cwn {
   public static final ddb a = dcr.ba;
   public static final dcs b = dcr.a;
   protected static final float c = 5.0F;
   protected static final efb d = cpn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, efb> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cpn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cpn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cpn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cpn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public cql(dca.d $$0, ddo $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.c_($$2) instanceof dav $$6) {
         cfz $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bdx.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(byo $$0, eee $$1, dav $$2, cfz $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cfl && $$1.b().equals(ha.a);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ha.a, cxp.b);
   }

   @Override
   public dcb a(cih $$0) {
      cmm $$1 = $$0.q();
      dxe $$2 = $$1.b_($$0.a());
      gu $$3 = $$0.a().c();
      dcb $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(amw.ay);
      ha $$6 = ha.a((double)$$0.i());
      boolean $$7 = !cpn.a($$4.k($$1, $$3), ha.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(cyk.a)) {
            ha $$8 = $$4.c(cyk.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<ha> $$9 = ddh.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ddh.a($$6.g()) : ddh.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == dxf.c));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      efb $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public efb b_(dcb $$0, cls $$1, gu $$2) {
      return this.a($$0, $$1, $$2, een.a());
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dcb $$0) {
      return ddh.b($$0.c(a));
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new daj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.i, dav::a);
   }
}
