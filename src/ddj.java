import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class ddj extends ddg {
   public static final MapCodec<ddj> b = b(ddj::new);
   public static final drv c = dhu.aE;
   private static final Map<it, evd> e = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         ddy.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         it.d,
         ddy.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         it.e,
         ddy.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         it.f,
         ddy.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends ddj> a() {
      return b;
   }

   protected ddj(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, it.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dea.a.n() : $$0;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      it $$3 = $$0.c(c);
      io $$4 = $$2.a($$3.g());
      drb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = super.a($$0);
      dba $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
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
