import com.google.common.collect.Maps;
import java.util.Map;

public class csd extends cro {
   public static final dgl a = dgb.ba;
   private static final Map<chv, csx> b = Maps.newHashMap();
   private static final eii c = csx.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public csd(chv $$0, dfk.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c;
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, Integer.valueOf(dgr.a($$0.i() + 180.0F)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
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
      $$0.a(a);
   }

   public static csx a(chv $$0) {
      return b.getOrDefault($$0, csy.iJ);
   }
}
