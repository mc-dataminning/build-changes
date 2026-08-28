import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekw extends eik {
   public static final MapCodec<ekw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               ekw.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ekw::new)
   );
   public final ekw.a e;
   public final float f;
   public final float g;

   public ekw(eik.c $$0, ekw.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      return a($$0, dxu.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ejc $$0, eik.a $$1) {
      iz $$2 = new iz($$1.h().d(), 90, $$1.h().e());
      dlm $$3 = dlm.a($$1.f());
      ekv.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public eit<?> e() {
      return eit.k;
   }

   public static enum a implements azu {
      a("warm"),
      b("cold");

      public static final Codec<ekw.a> c = azu.a(ekw.a::values);
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
