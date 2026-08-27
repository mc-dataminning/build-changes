import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eht extends efh {
   public static final Codec<eht> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               eht.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eht::new)
   );
   public final eht.a e;
   public final float f;
   public final float g;

   public eht(efh.c $$0, eht.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      return a($$0, dur.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(efz $$0, efh.a $$1) {
      ib $$2 = new ib($$1.h().d(), 90, $$1.h().e());
      dik $$3 = dik.a($$1.f());
      ehs.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public efq<?> e() {
      return efq.k;
   }

   public static enum a implements aye {
      a("warm"),
      b("cold");

      public static final Codec<eht.a> c = aye.a(eht.a::values);
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
