import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class cta extends crd {
   public static final dfq c = crd.b;
   protected static final float d = 1.0F;
   protected static final ehw e = csl.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ehw f = csl.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ehw g = eht.a(e, f);
   private static final Map<csl, cta> h = Maps.newHashMap();
   private static final Iterable<ehd> i = ImmutableList.of(new ehd(0.5, 1.0, 0.5));

   protected cta(csl $$0, dey.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<ehd> b(dez $$0) {
      return i;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return g;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      if ($$6.a(cja.nE) || $$6.a(cja.tf)) {
         return bgq.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bgq.a($$1.B);
      } else {
         bgq $$7 = csw.a($$1, $$2, csm.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(egz $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(c);
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(csm.eh);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return csw.c;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   public static dez a(csl $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dez $$0) {
      return $$0.a(apl.bj, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}
