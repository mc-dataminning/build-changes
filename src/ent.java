import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ent extends elg {
   public static final MapCodec<ent> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               ent.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ent::new)
   );
   public final ent.a e;
   public final float f;
   public final float g;

   public ent(elg.c $$0, ent.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      return a($$0, eao.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ely $$0, elg.a $$1) {
      jf $$2 = new jf($$1.h().d(), 90, $$1.h().e());
      doa $$3 = doa.a($$1.f());
      ens.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public elp<?> e() {
      return elp.k;
   }

   public static enum a implements bab {
      a("warm"),
      b("cold");

      public static final Codec<ent.a> c = bab.a(ent.a::values);
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
