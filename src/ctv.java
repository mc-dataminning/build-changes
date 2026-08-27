import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctv extends czx {
   public static final dgl a = dgb.ba;
   public static final dgc b = dgb.a;
   protected static final float c = 5.0F;
   protected static final eii d = csx.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eii> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         csx.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         csx.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         csx.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         csx.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public ctv(dfk.d $$0, dgy $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.c_($$2) instanceof def $$6) {
         cjh $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bha.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cbw $$0, ehl $$1, def $$2, cjh $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cit && $$1.b().equals(hc.a);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hc.a, daz.b);
   }

   @Override
   public dfl a(clp $$0) {
      cpx $$1 = $$0.q();
      eao $$2 = $$1.b_($$0.a());
      gw $$3 = $$0.a().c();
      dfl $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apu.az);
      hc $$6 = hc.a((double)$$0.i());
      boolean $$7 = !csx.a($$4.k($$1, $$3), hc.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbu.a)) {
            hc $$8 = $$4.c(dbu.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<hc> $$9 = dgr.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dgr.a($$6.g()) : dgr.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == eap.c));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      eii $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehu.a());
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.b && !this.a($$0, $$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfl $$0) {
      return dgr.b($$0.c(a));
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.i, def::a);
   }
}
