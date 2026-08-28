import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eky extends eim {
   public static final MapCodec<eky> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eky.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eky::new)
   );
   public final eky.a e;
   public final float f;
   public final float g;

   public eky(eim.c $$0, eky.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      return a($$0, dxw.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eje $$0, eim.a $$1) {
      iz $$2 = new iz($$1.h().d(), 90, $$1.h().e());
      dlo $$3 = dlo.a($$1.f());
      ekx.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public eiv<?> e() {
      return eiv.k;
   }

   public static enum a implements azu {
      a("warm"),
      b("cold");

      public static final Codec<eky.a> c = azu.a(eky.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
