import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class coz extends cow {
   public static final dcv a = ctg.aC;
   private static final Map<ha, efb> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         cpn.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ha.d,
         cpn.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ha.e,
         cpn.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ha.f,
         cpn.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected coz(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b.get($$0.c(a));
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, c);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cpo.a.n() : $$0;
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3.g());
      dcb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = super.a($$0);
      cmp $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
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
