import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cvk extends cvh {
   public static final MapCodec<cvk> b = b(cvk::new);
   public static final djj c = czu.aE;
   private static final Map<ia, elu> e = Maps.newEnumMap(
      ImmutableMap.of(
         ia.c,
         cvz.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ia.d,
         cvz.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ia.e,
         cvz.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ia.f,
         cvz.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cvk> a() {
      return b;
   }

   protected cvk(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ia.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cwb.a.o() : $$0;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = $$0.c(c);
      hv $$4 = $$2.a($$3.g());
      dip $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = super.a($$0);
      ctb $$2 = $$0.q();
      hv $$3 = $$0.a();
      ia[] $$4 = $$0.f();

      for (ia $$5 : $$4) {
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
