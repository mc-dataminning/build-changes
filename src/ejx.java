import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejx extends ehl {
   public static final MapCodec<ejx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               ejx.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejx::new)
   );
   public final ejx.a e;
   public final float f;
   public final float g;

   public ejx(ehl.c $$0, ejx.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      return a($$0, dwv.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eid $$0, ehl.a $$1) {
      io $$2 = new io($$1.h().d(), 90, $$1.h().e());
      dkn $$3 = dkn.a($$1.f());
      ejw.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ehu<?> e() {
      return ehu.k;
   }

   public static enum a implements ayz {
      a("warm"),
      b("cold");

      public static final Codec<ejx.a> c = ayz.a(ejx.a::values);
      private final String d;

      private a(String $$0) {
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
