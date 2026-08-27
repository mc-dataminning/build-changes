import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class efo extends edc {
   public static final Codec<efo> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               efo.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, efo::new)
   );
   public final efo.a e;
   public final float f;
   public final float g;

   public efo(edc.c $$0, efo.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      return a($$0, dsm.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(edu $$0, edc.a $$1) {
      ib $$2 = new ib($$1.h().d(), 90, $$1.h().e());
      dgm $$3 = dgm.a($$1.f());
      efn.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public edl<?> e() {
      return edl.k;
   }

   public static enum a implements axq {
      a("warm"),
      b("cold");

      public static final Codec<efo.a> c = axq.a(efo.a::values);
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
