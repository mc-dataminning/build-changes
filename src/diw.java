import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class diw extends dit {
   public static final MapCodec<diw> b = b(diw::new);
   public static final dxt<jn> c = dnj.aF;
   private static final Map<jn, fbt> e = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djl.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jn.d,
         djl.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jn.e,
         djl.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jn.f,
         djl.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends diw> a() {
      return b;
   }

   protected diw(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? djn.a.m() : $$0;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      jn $$3 = $$0.c(c);
      ji $$4 = $$2.a($$3.g());
      dww $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = super.a($$0);
      dgk $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
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
