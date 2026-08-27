import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dbf extends crb {
   public static final dfs a = cwd.aC;
   private static final Map<hb, ehy> b = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         csk.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hb.d,
         csk.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hb.e,
         csk.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hb.f,
         csk.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public dbf(chk $$0, dex.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hb.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == $$0.c(a).g() && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = this.n();
      cpn $$2 = $$0.q();
      gv $$3 = $$0.a();
      hb[] $$4 = $$0.f();

      for (hb $$5 : $$4) {
         if ($$5.o().d()) {
            hb $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
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
