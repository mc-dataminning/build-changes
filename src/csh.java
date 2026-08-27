import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class csh extends cse {
   public static final dgd a = cwo.aC;
   private static final Map<ha, eig> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csv.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ha.d,
         csv.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ha.e,
         csv.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ha.f,
         csv.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected csh(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csw.a.n() : $$0;
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      ha $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfj $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = super.a($$0);
      cpy $$2 = $$0.q();
      gw $$3 = $$0.a();
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
