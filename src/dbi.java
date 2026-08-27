import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbi extends czk {
   public static final dfs a = cwd.aC;
   protected static final float b = 2.0F;
   protected static final float c = 4.5F;
   protected static final float d = 12.5F;
   private static final Map<hb, ehy> h = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         csk.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hb.d,
         csk.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hb.f,
         csk.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hb.e,
         csk.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public dbi(dex.d $$0, dgl $$1) {
      super($$0.a($$1.d()), $$1);
      this.k(this.C.b().a(a, hb.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return h.get($$0.c(a));
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.a($$0.c(a).g())).e();
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = this.n();
      eab $$2 = $$0.q().b_($$0.a());
      cpn $$3 = $$0.q();
      gv $$4 = $$0.a();
      hb[] $$5 = $$0.f();

      for (hb $$6 : $$5) {
         if ($$6.o().d()) {
            hb $$7 = $$6.g();
            $$1 = $$1.a(a, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eac.c));
            }
         }
      }

      return null;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dey $$0) {
      return $$0.c(a).p();
   }

   @Override
   public ehf h(dey $$0) {
      ehy $$1 = h.get($$0.c(a));
      return $$1.a().f();
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
      $$0.a(a, e);
   }
}
