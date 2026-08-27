import com.google.common.collect.Maps;
import java.util.Map;

public class crw extends crh {
   public static final dge a = dfu.ba;
   private static final Map<cho, csq> b = Maps.newHashMap();
   private static final eib c = csq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public crw(cho $$0, dfd.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c;
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, Integer.valueOf(dgk.a($$0.i() + 180.0F)));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
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
      $$0.a(a);
   }

   public static csq a(cho $$0) {
      return b.getOrDefault($$0, csr.iJ);
   }
}
