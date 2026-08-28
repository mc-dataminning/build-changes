import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eto extends erb {
   public static final MapCodec<eto> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eto.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eto::new)
   );
   public final eto.a e;
   public final float f;
   public final float g;

   public eto(erb.c $$0, eto.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      return a($$0, egg.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ert $$0, erb.a $$1) {
      iu $$2 = new iu($$1.h().d(), 90, $$1.h().e());
      dsz $$3 = dsz.a($$1.f());
      etn.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public erk<?> e() {
      return erk.k;
   }

   public static enum a implements bak {
      a("warm"),
      b("cold");

      public static final Codec<eto.a> c = bak.a(eto.a::values);
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
