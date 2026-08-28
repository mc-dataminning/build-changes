import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dib extends dhy {
   public static final MapCodec<dib> b = b(dib::new);
   public static final dws<jm> c = dml.aF;
   private static final Map<jm, fas> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         diq.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         diq.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         diq.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         diq.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dib> a() {
      return b;
   }

   protected dib(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? dis.a.m() : $$0;
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dvv $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = super.a($$0);
      dfp $$2 = $$0.q();
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
