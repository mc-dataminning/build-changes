import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class ctb extends cre {
   public static final dfr c = cre.b;
   protected static final float d = 1.0F;
   protected static final ehx e = csm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ehx f = csm.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ehx g = ehu.a(e, f);
   private static final Map<csm, ctb> h = Maps.newHashMap();
   private static final Iterable<ehe> i = ImmutableList.of(new ehe(0.5, 1.0, 0.5));

   protected ctb(csm $$0, dez.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<ehe> b(dfa $$0) {
      return i;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return g;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      if ($$6.a(cjb.nE) || $$6.a(cjb.tf)) {
         return bgq.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bgq.a($$1.B);
      } else {
         bgq $$7 = csx.a($$1, $$2, csn.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(eha $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(c);
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(csn.eh);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return csx.c;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   public static dfa a(csm $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dfa $$0) {
      return $$0.a(apl.bj, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}
