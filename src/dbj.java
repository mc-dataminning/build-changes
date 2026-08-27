import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbj extends crh {
   public static final dfs a = cwd.aC;
   private static final Map<hb, ehy> b = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         csk.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hb.d,
         csk.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hb.f,
         csk.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hb.e,
         csk.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected dbj(czm.a $$0, dex.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hb.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = this.n();
      coq $$2 = $$0.q();
      gv $$3 = $$0.a();
      hb[] $$4 = $$0.f();

      for (hb $$5 : $$4) {
         if ($$5.o().d()) {
            hb $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
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
