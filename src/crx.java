import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class crx extends ctd {
   public static final dgd a = cwo.aC;
   protected static final float b = 2.0F;
   private static final Map<ha, eig> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.d,
         csv.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ha.e,
         csv.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ha.c,
         csv.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ha.f,
         csv.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final das d;
   private final Supplier<cja> e;

   protected crx(das $$0, Supplier<cja> $$1, dfi.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, ha.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(dar.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.a(csw.cC);
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(this.e.get());
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }
}
