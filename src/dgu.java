import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dgu extends dgr {
   public static final MapCodec<dgu> b = b(dgu::new);
   public static final dvi c = dlf.aF;
   private static final Map<jj, ezm> e = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dhj.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jj.d,
         dhj.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jj.e,
         dhj.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jj.f,
         dhj.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dgu> a() {
      return b;
   }

   protected dgu(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jj.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dhl.a.o() : $$0;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      jj $$3 = $$0.c(c);
      je $$4 = $$2.a($$3.g());
      duo $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = super.a($$0);
      dej $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
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
