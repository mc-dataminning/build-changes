import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class djw extends djt {
   public static final MapCodec<djw> b = b(djw::new);
   public static final dyr<jm> c = doj.aF;
   private static final Map<jm, fcr> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkl.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         dkl.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         dkl.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         dkl.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends djw> a() {
      return b;
   }

   protected djw(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? dkn.a.m() : $$0;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dxu $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = super.a($$0);
      dhk $$2 = $$0.q();
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
