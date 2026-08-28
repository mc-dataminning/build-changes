import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqa extends enn {
   public static final MapCodec<eqa> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eqa.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eqa::new)
   );
   public final eqa.a e;
   public final float f;
   public final float g;

   public eqa(enn.c $$0, eqa.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      return a($$0, ect.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eof $$0, enn.a $$1) {
      ji $$2 = new ji($$1.h().d(), 90, $$1.h().e());
      dqf $$3 = dqf.a($$1.f());
      epz.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public enw<?> e() {
      return enw.k;
   }

   public static enum a implements azv {
      a("warm"),
      b("cold");

      public static final Codec<eqa.a> c = azv.a(eqa.a::values);
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
