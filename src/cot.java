import com.google.common.collect.Maps;
import java.util.Map;

public class cot extends cod {
   public static final ddb a = dcr.ba;
   private static final Map<cen, cpn> b = Maps.newHashMap();
   private static final efb c = cpn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public cot(cen $$0, dca.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return c;
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, Integer.valueOf(ddh.a($$0.i() + 180.0F)));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
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
      $$0.a(a);
   }

   public static cpn a(cen $$0) {
      return b.getOrDefault($$0, cpo.iJ);
   }
}
