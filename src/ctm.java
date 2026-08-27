import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class ctm extends crp {
   public static final dgc c = crp.b;
   protected static final float d = 1.0F;
   protected static final eii e = csx.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eii f = csx.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eii g = eif.a(e, f);
   private static final Map<csx, ctm> h = Maps.newHashMap();
   private static final Iterable<ehp> i = ImmutableList.of(new ehp(0.5, 1.0, 0.5));

   protected ctm(csx $$0, dfk.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<ehp> b(dfl $$0) {
      return i;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return g;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      if ($$6.a(cjk.nE) || $$6.a(cjk.tf)) {
         return bha.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bha.a($$1.B);
      } else {
         bha $$7 = cti.a($$1, $$2, csy.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ehl $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(c);
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(csy.eh);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cti.c;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   public static dfl a(csx $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dfl $$0) {
      return $$0.a(apu.bj, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}
