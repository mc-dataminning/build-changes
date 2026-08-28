import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class enb extends eko {
   public static final MapCodec<enb> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               enb.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, enb::new)
   );
   public final enb.a e;
   public final float f;
   public final float g;

   public enb(eko.c $$0, enb.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      return a($$0, dzw.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(elg $$0, eko.a $$1) {
      je $$2 = new je($$1.h().d(), 90, $$1.h().e());
      dnj $$3 = dnj.a($$1.f());
      ena.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ekx<?> e() {
      return ekx.k;
   }

   public static enum a implements azy {
      a("warm"),
      b("cold");

      public static final Codec<enb.a> c = azy.a(enb.a::values);
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
