import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class ctk extends crn {
   public static final dga c = crn.b;
   protected static final float d = 1.0F;
   protected static final eig e = csv.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eig f = csv.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eig g = eid.a(e, f);
   private static final Map<csv, ctk> h = Maps.newHashMap();
   private static final Iterable<ehn> i = ImmutableList.of(new ehn(0.5, 1.0, 0.5));

   protected ctk(csv $$0, dfi.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<ehn> b(dfj $$0) {
      return i;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return g;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      if ($$6.a(cji.nE) || $$6.a(cji.tf)) {
         return bgy.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bgy.a($$1.B);
      } else {
         bgy $$7 = ctg.a($$1, $$2, csw.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ehj $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(c);
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(csw.eh);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return ctg.c;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   public static dfj a(csv $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dfj $$0) {
      return $$0.a(aps.bj, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}
