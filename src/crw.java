import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class crw extends crt {
   public static final dfs a = cwd.aC;
   private static final Map<hb, ehy> b = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         csk.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         hb.d,
         csk.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         hb.e,
         csk.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         hb.f,
         csk.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected crw(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csl.a.n() : $$0;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = $$0.c(a);
      gv $$4 = $$2.a($$3.g());
      dey $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = super.a($$0);
      cpn $$2 = $$0.q();
      gv $$3 = $$0.a();
      hb[] $$4 = $$0.f();

      for (hb $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(a, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
