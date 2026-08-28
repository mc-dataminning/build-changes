import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class etv extends eri {
   public static final MapCodec<etv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               etv.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, etv::new)
   );
   public final etv.a e;
   public final float f;
   public final float g;

   public etv(eri.c $$0, etv.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      return a($$0, egn.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(esa $$0, eri.a $$1) {
      iv $$2 = new iv($$1.h().d(), 90, $$1.h().e());
      dtg $$3 = dtg.a($$1.f());
      etu.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public err<?> e() {
      return err.k;
   }

   public static enum a implements bak {
      a("warm"),
      b("cold");

      public static final Codec<etv.a> c = bak.a(etv.a::values);
      @Deprecated
      public static final Codec<etv.a> d = ayu.c(etv.a::valueOf);
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
