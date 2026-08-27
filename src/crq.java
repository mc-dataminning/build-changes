import com.google.common.collect.Maps;
import java.util.Map;

public class crq extends crb {
   public static final dfy a = dfo.ba;
   private static final Map<chk, csk> b = Maps.newHashMap();
   private static final ehy c = csk.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public crq(chk $$0, dex.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c;
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, Integer.valueOf(dge.a($$0.i() + 180.0F)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.a && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   public static csk a(chk $$0) {
      return b.getOrDefault($$0, csl.iJ);
   }
}
