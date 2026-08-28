import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eme extends ejr {
   public static final MapCodec<eme> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eme.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eme::new)
   );
   public final eme.a e;
   public final float f;
   public final float g;

   public eme(ejr.c $$0, eme.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      return a($$0, dyy.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ekj $$0, ejr.a $$1) {
      jd $$2 = new jd($$1.h().d(), 90, $$1.h().e());
      dmm $$3 = dmm.a($$1.f());
      emd.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public eka<?> e() {
      return eka.k;
   }

   public static enum a implements azk {
      a("warm"),
      b("cold");

      public static final Codec<eme.a> c = azk.a(eme.a::values);
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
