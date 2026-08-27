import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cue extends cub {
   public static final MapCodec<cue> b = b(cue::new);
   public static final dhq c = cyo.aE;
   private static final Map<hx, ekb> e = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cut.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         hx.d,
         cut.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         hx.e,
         cut.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         hx.f,
         cut.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cue> a() {
      return b;
   }

   protected cue(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, hx.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cuv.a.o() : $$0;
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = $$0.c(c);
      ht $$4 = $$2.a($$3.g());
      dgw $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = super.a($$0);
      crv $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
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
