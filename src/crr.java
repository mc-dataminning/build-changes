import com.google.common.collect.Maps;
import java.util.Map;

public class crr extends crc {
   public static final dfz a = dfp.ba;
   private static final Map<chl, csl> b = Maps.newHashMap();
   private static final ehw c = csl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public crr(chl $$0, dey.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c;
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, Integer.valueOf(dgf.a($$0.i() + 180.0F)));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   public static csl a(chl $$0) {
      return b.getOrDefault($$0, csm.iJ);
   }
}
