import com.google.common.collect.Maps;
import java.util.Map;

public class crs extends crd {
   public static final dga a = dfq.ba;
   private static final Map<chm, csm> b = Maps.newHashMap();
   private static final ehx c = csm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public crs(chm $$0, dez.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c;
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, Integer.valueOf(dgg.a($$0.i() + 180.0F)));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   public static csm a(chm $$0) {
      return b.getOrDefault($$0, csn.iJ);
   }
}
