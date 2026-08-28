import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dem extends dej {
   public static final MapCodec<dem> b = b(dem::new);
   public static final dsy c = dix.aE;
   private static final Map<je, ewm> e = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfb.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         je.d,
         dfb.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         je.e,
         dfb.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         je.f,
         dfb.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dem> a() {
      return b;
   }

   protected dem(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfd.a.o() : $$0;
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      je $$3 = $$0.c(c);
      iz $$4 = $$2.a($$3.g());
      dse $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = super.a($$0);
      dcd $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
