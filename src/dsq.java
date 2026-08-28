import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dsq extends dig {
   public static final MapCodec<dsq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqr.a.b.fieldOf("kind").forGetter(dig::b), t()).apply($$0, dsq::new));
   public static final dxs<jn> d = dni.aF;
   private static final Map<jn, fbs> b = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djk.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jn.d,
         djk.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jn.f,
         djk.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jn.e,
         djk.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dsq> a() {
      return c;
   }

   protected dsq(dqr.a $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jn.c));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = super.a($$0);
      dfl $$2 = $$0.q();
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
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
