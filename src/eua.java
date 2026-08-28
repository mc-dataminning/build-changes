import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eua extends ern {
   public static final MapCodec<eua> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eua.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eua::new)
   );
   public final eua.a e;
   public final float f;
   public final float g;

   public eua(ern.c $$0, eua.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      return a($$0, egs.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(esf $$0, ern.a $$1) {
      iv $$2 = new iv($$1.h().d(), 90, $$1.h().e());
      dtl $$3 = dtl.a($$1.f());
      etz.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public erw<?> e() {
      return erw.k;
   }

   public static enum a implements bak {
      a("warm"),
      b("cold");

      public static final Codec<eua.a> c = bak.a(eua.a::values);
      @Deprecated
      public static final Codec<eua.a> d = ayu.c(eua.a::valueOf);
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
