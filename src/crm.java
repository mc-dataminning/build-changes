import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class crm extends css {
   public static final dfs a = cwd.aC;
   protected static final float b = 2.0F;
   private static final Map<hb, ehy> c = Maps.newEnumMap(
      ImmutableMap.of(
         hb.d,
         csk.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         hb.e,
         csk.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         hb.c,
         csk.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         hb.f,
         csk.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final dah d;
   private final Supplier<cir> e;

   protected crm(dah $$0, Supplier<cir> $$1, dex.d $$2) {
      super($$2);
      this.k(this.C.b().a(a, hb.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c.get($$0.c(a));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.a().n().a(dag.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(csl.cC);
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(this.e.get());
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }
}
