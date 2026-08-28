import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elk extends eix {
   public static final MapCodec<elk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               elk.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elk::new)
   );
   public final elk.a e;
   public final float f;
   public final float g;

   public elk(eix.c $$0, elk.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      return a($$0, dyg.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ejp $$0, eix.a $$1) {
      ja $$2 = new ja($$1.h().d(), 90, $$1.h().e());
      dlv $$3 = dlv.a($$1.f());
      elj.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ejg<?> e() {
      return ejg.k;
   }

   public static enum a implements azc {
      a("warm"),
      b("cold");

      public static final Codec<elk.a> c = azc.a(elk.a::values);
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
