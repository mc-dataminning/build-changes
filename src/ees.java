import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ees extends ecg {
   public static final Codec<ees> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               ees.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ees::new)
   );
   public final ees.a e;
   public final float f;
   public final float g;

   public ees(ecg.c $$0, ees.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      return a($$0, drq.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ecy $$0, ecg.a $$1) {
      ib $$2 = new ib($$1.h().d(), 90, $$1.h().e());
      dfr $$3 = dfr.a($$1.f());
      eer.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ecp<?> e() {
      return ecp.k;
   }

   public static enum a implements axg {
      a("warm"),
      b("cold");

      public static final Codec<ees.a> c = axg.a(ees.a::values);
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
