import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edx extends ebl {
   public static final Codec<edx> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               edx.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, edx::new)
   );
   public final edx.a e;
   public final float f;
   public final float g;

   public edx(ebl.c $$0, edx.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      return a($$0, dqv.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ecd $$0, ebl.a $$1) {
      hz $$2 = new hz($$1.h().d(), 90, $$1.h().e());
      dfe $$3 = dfe.a($$1.f());
      edw.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ebu<?> e() {
      return ebu.k;
   }

   public static enum a implements axc {
      a("warm"),
      b("cold");

      public static final Codec<edx.a> c = axc.a(edx.a::values);
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
