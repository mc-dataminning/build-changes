import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cti extends czk {
   public static final dfy a = dfo.ba;
   public static final dfp b = dfo.a;
   protected static final float c = 5.0F;
   protected static final ehy d = csk.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ehy> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         csk.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         csk.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         csk.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         csk.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public cti(dex.d $$0, dgl $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.c_($$2) instanceof dds $$6) {
         ciw $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bgo.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cbl $$0, ehb $$1, dds $$2, ciw $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cii && $$1.b().equals(hb.a);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hb.a, dam.b);
   }

   @Override
   public dey a(cle $$0) {
      cpk $$1 = $$0.q();
      eab $$2 = $$1.b_($$0.a());
      gv $$3 = $$0.a().c();
      dey $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apj.az);
      hb $$6 = hb.a((double)$$0.i());
      boolean $$7 = !csk.a($$4.k($$1, $$3), hb.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbh.a)) {
            hb $$8 = $$4.c(dbh.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<hb> $$9 = dge.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dge.a($$6.g()) : dge.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == eac.c));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      ehy $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      return this.a($$0, $$1, $$2, ehk.a());
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.b && !this.a($$0, $$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dey $$0) {
      return dge.b($$0.c(a));
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.i, dds::a);
   }
}
