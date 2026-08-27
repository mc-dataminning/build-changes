import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edq extends ebe {
   public static final Codec<edq> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               edq.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, edq::new)
   );
   public final edq.a e;
   public final float f;
   public final float g;

   public edq(ebe.c $$0, edq.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      return a($$0, dqo.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ebw $$0, ebe.a $$1) {
      hz $$2 = new hz($$1.h().d(), 90, $$1.h().e());
      dfa $$3 = dfa.a($$1.f());
      edp.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ebn<?> e() {
      return ebn.k;
   }

   public static enum a implements axc {
      a("warm"),
      b("cold");

      public static final Codec<edq.a> c = axc.a(edq.a::values);
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
