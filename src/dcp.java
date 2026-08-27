import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dcp extends dcm {
   public static final MapCodec<dcp> b = b(dcp::new);
   public static final drb c = dha.aE;
   private static final Map<is, eui> e = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         dde.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         is.d,
         dde.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         is.e,
         dde.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         is.f,
         dde.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dcp> a() {
      return b;
   }

   protected dcp(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, is.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? ddg.a.n() : $$0;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      is $$3 = $$0.c(c);
      in $$4 = $$2.a($$3.g());
      dqh $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = super.a($$0);
      dag $$2 = $$0.q();
      in $$3 = $$0.a();
      is[] $$4 = $$0.f();

      for (is $$5 : $$4) {
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
