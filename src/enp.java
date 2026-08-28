import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class enp extends elc {
   public static final MapCodec<enp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               enp.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, enp::new)
   );
   public final enp.a e;
   public final float f;
   public final float g;

   public enp(elc.c $$0, enp.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      return a($$0, eak.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(elu $$0, elc.a $$1) {
      je $$2 = new je($$1.h().d(), 90, $$1.h().e());
      dnx $$3 = dnx.a($$1.f());
      eno.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ell<?> e() {
      return ell.k;
   }

   public static enum a implements azz {
      a("warm"),
      b("cold");

      public static final Codec<enp.a> c = azz.a(enp.a::values);
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
