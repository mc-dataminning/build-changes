import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dcz extends deh {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akl.a(lf.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akl.a(lf.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akl.a(lf.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dcz::new)
   );
   public static final drv b = dhu.aE;
   protected static final float c = 2.0F;
   private static final Map<it, evd> d = Maps.newEnumMap(
      ImmutableMap.of(
         it.d,
         ddy.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         it.e,
         ddy.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         it.c,
         ddy.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         it.f,
         ddy.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akl<ddy> e;
   private final akl<ddy> f;
   private final akl<ctj> g;

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   protected dcz(akl<ddy> $$0, akl<ddy> $$1, akl<ctj> $$2, dra.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, it.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<ddy> $$6 = $$3.H_().d(lf.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(dlu.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(dea.cC);
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto((daw)DataFixUtils.orElse($$0.H_().d(lf.G).e(this.g), this));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
