import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dbs extends dbp {
   public static final MapCodec<dbs> b = b(dbs::new);
   public static final dqc c = dgc.aE;
   private static final Map<ij, etc> e = Maps.newEnumMap(
      ImmutableMap.of(
         ij.c,
         dch.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ij.d,
         dch.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ij.e,
         dch.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ij.f,
         dch.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dbs> a() {
      return b;
   }

   protected dbs(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ij.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dcj.a.n() : $$0;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      ij $$3 = $$0.c(c);
      id $$4 = $$2.a($$3.g());
      dpi $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = super.a($$0);
      czj $$2 = $$0.q();
      id $$3 = $$0.a();
      ij[] $$4 = $$0.f();

      for (ij $$5 : $$4) {
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
