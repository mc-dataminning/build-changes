import com.google.common.collect.Maps;
import java.util.Map;

public class csb extends crm {
   public static final dgj a = dfz.ba;
   private static final Map<cht, csv> b = Maps.newHashMap();
   private static final eig c = csv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public csb(cht $$0, dfi.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c;
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, Integer.valueOf(dgp.a($$0.i() + 180.0F)));
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   public static csv a(cht $$0) {
      return b.getOrDefault($$0, csw.iJ);
   }
}
