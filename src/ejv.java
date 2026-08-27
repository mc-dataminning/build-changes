import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejv extends ehj {
   public static final MapCodec<ejv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               ejv.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejv::new)
   );
   public final ejv.a e;
   public final float f;
   public final float g;

   public ejv(ehj.c $$0, ejv.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      return a($$0, dwt.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eib $$0, ehj.a $$1) {
      io $$2 = new io($$1.h().d(), 90, $$1.h().e());
      dkl $$3 = dkl.a($$1.f());
      eju.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ehs<?> e() {
      return ehs.k;
   }

   public static enum a implements ayx {
      a("warm"),
      b("cold");

      public static final Codec<ejv.a> c = ayx.a(ejv.a::values);
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
