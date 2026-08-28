import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class div extends dis {
   public static final MapCodec<div> b = b(div::new);
   public static final dxs<jn> c = dni.aF;
   private static final Map<jn, fbs> e = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djk.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jn.d,
         djk.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jn.e,
         djk.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jn.f,
         djk.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends div> a() {
      return b;
   }

   protected div(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? djm.a.m() : $$0;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      jn $$3 = $$0.c(c);
      ji $$4 = $$2.a($$3.g());
      dwv $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = super.a($$0);
      dgj $$2 = $$0.q();
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
