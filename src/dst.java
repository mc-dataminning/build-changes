import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dst extends dij {
   public static final MapCodec<dst> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqu.a.b.fieldOf("kind").forGetter(dij::b), t()).apply($$0, dst::new));
   public static final dxv<jn> d = dnl.aF;
   private static final Map<jn, fbv> b = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djn.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jn.d,
         djn.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jn.f,
         djn.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jn.e,
         djn.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dst> a() {
      return c;
   }

   protected dst(dqu.a $$0, dwx.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jn.c));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = super.a($$0);
      dfo $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
