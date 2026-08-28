import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dhu extends dhr {
   public static final MapCodec<dhu> b = b(dhu::new);
   public static final dwl<jm> c = dme.aF;
   private static final Map<jm, fal> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dij.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         dij.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         dij.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         dij.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dhu> a() {
      return b;
   }

   protected dhu(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? dil.a.m() : $$0;
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dvo $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = super.a($$0);
      dfi $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
