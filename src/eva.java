import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eva extends esn {
   public static final MapCodec<eva> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eva.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eva::new)
   );
   public final eva.a e;
   public final float f;
   public final float g;

   public eva(esn.c $$0, eva.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      return a($$0, ehp.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(etf $$0, esn.a $$1) {
      iw $$2 = new iw($$1.h().d(), 90, $$1.h().e());
      dui $$3 = dui.a($$1.f());
      euz.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public esw<?> e() {
      return esw.k;
   }

   public static enum a implements bax {
      a("warm"),
      b("cold");

      public static final Codec<eva.a> c = bax.a(eva.a::values);
      @Deprecated
      public static final Codec<eva.a> d = azg.c(eva.a::valueOf);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
