import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emc extends ejp {
   public static final MapCodec<emc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               emc.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, emc::new)
   );
   public final emc.a e;
   public final float f;
   public final float g;

   public emc(ejp.c $$0, emc.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      return a($$0, dyy.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ekh $$0, ejp.a $$1) {
      jd $$2 = new jd($$1.h().d(), 90, $$1.h().e());
      dmm $$3 = dmm.a($$1.f());
      emb.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ejy<?> e() {
      return ejy.k;
   }

   public static enum a implements azk {
      a("warm"),
      b("cold");

      public static final Codec<emc.a> c = azk.a(emc.a::values);
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
