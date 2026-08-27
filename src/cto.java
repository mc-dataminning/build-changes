import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cto extends czq {
   public static final dge a = dfu.ba;
   public static final dfv b = dfu.a;
   protected static final float c = 5.0F;
   protected static final eib d = csq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eib> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         csq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         csq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         csq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         csq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public cto(dfd.d $$0, dgr $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.c_($$2) instanceof ddy $$6) {
         cja $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bgt.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cbp $$0, ehe $$1, ddy $$2, cja $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cim && $$1.b().equals(hc.a);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hc.a, das.b);
   }

   @Override
   public dfe a(cli $$0) {
      cpq $$1 = $$0.q();
      eah $$2 = $$1.b_($$0.a());
      gw $$3 = $$0.a().c();
      dfe $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apo.az);
      hc $$6 = hc.a((double)$$0.i());
      boolean $$7 = !csq.a($$4.k($$1, $$3), hc.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbn.a)) {
            hc $$8 = $$4.c(dbn.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<hc> $$9 = dgk.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dgk.a($$6.g()) : dgk.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == eai.c));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      eib $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehn.a());
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.b && !this.a($$0, $$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfe $$0) {
      return dgk.b($$0.c(a));
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.i, ddy::a);
   }
}
