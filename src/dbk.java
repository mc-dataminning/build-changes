import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbk extends dav {
   public static final dfs a = cwd.aC;
   protected static final float b = 2.5F;
   private static final Map<hb, ehy> c = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         csk.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         hb.d,
         csk.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         hb.e,
         csk.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         hb.f,
         csk.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected dbk(dex.d $$0, iu $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hb.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return h($$0);
   }

   public static ehy h(dey $$0) {
      return c.get($$0.c(a));
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
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csl.a.n() : $$0;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      hb $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      hb $$10 = $$4.g();
      $$1.a(iw.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.i, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
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
