import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoo extends emb {
   public static final MapCodec<eoo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eoo.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eoo::new)
   );
   public final eoo.a e;
   public final float f;
   public final float g;

   public eoo(emb.c $$0, eoo.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      return a($$0, ebj.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(emt $$0, emb.a $$1) {
      jh $$2 = new jh($$1.h().d(), 90, $$1.h().e());
      dow $$3 = dow.a($$1.f());
      eon.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public emk<?> e() {
      return emk.k;
   }

   public static enum a implements baj {
      a("warm"),
      b("cold");

      public static final Codec<eoo.a> c = baj.a(eoo.a::values);
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
