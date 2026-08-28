import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ert extends epg {
   public static final MapCodec<ert> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               ert.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ert::new)
   );
   public final ert.a e;
   public final float f;
   public final float g;

   public ert(epg.c $$0, ert.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      return a($$0, eel.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(epy $$0, epg.a $$1) {
      jj $$2 = new jj($$1.h().d(), 90, $$1.h().e());
      drm $$3 = drm.a($$1.f());
      ers.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public epp<?> e() {
      return epp.k;
   }

   public static enum a implements bag {
      a("warm"),
      b("cold");

      public static final Codec<ert.a> c = bag.a(ert.a::values);
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
