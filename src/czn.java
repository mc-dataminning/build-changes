import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class czn extends czk {
   public static final MapCodec<czn> b = b(czn::new);
   public static final dnv c = ddx.aE;
   private static final Map<ih, eqm> e = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dac.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ih.d,
         dac.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ih.e,
         dac.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ih.f,
         dac.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends czn> a() {
      return b;
   }

   protected czn(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dae.a.o() : $$0;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = $$0.c(c);
      ib $$4 = $$2.a($$3.g());
      dnb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = super.a($$0);
      cxe $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
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
