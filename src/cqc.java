import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class cqc extends coe {
   public static final dcs c = coe.b;
   protected static final float d = 1.0F;
   protected static final efb e = cpn.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final efb f = cpn.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final efb g = eey.a(e, f);
   private static final Map<cpn, cqc> h = Maps.newHashMap();
   private static final Iterable<eei> i = ImmutableList.of(new eei(0.5, 1.0, 0.5));

   protected cqc(cpn $$0, dca.d $$1) {
      super($$1);
      this.k(this.C.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<eei> b(dcb $$0) {
      return i;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return g;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      cfz $$6 = $$3.b($$4);
      if ($$6.a(cgc.nE) || $$6.a(cgc.tf)) {
         return bdx.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return bdx.a($$1.B);
      } else {
         bdx $$7 = cpy.a($$1, $$2, cpo.eh.n(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(eee $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(c);
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(cpo.eh);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return cpy.c;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   public static dcb a(cpn $$0) {
      return h.get($$0).n();
   }

   public static boolean g(dcb $$0) {
      return $$0.a(amw.bi, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}
