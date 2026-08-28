import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class epx extends enk {
   public static final MapCodec<epx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               epx.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, epx::new)
   );
   public final epx.a e;
   public final float f;
   public final float g;

   public epx(enk.c $$0, epx.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      return a($$0, ecq.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eoc $$0, enk.a $$1) {
      ji $$2 = new ji($$1.h().d(), 90, $$1.h().e());
      dqc $$3 = dqc.a($$1.f());
      epw.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ent<?> e() {
      return ent.k;
   }

   public static enum a implements azu {
      a("warm"),
      b("cold");

      public static final Codec<epx.a> c = azu.a(epx.a::values);
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
