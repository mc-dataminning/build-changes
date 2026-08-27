import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eca extends dzo {
   public static final Codec<eca> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               eca.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eca::new)
   );
   public final eca.a e;
   public final float f;
   public final float g;

   public eca(dzo.c $$0, eca.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      return a($$0, doy.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eag $$0, dzo.a $$1) {
      hx $$2 = new hx($$1.h().d(), 90, $$1.h().e());
      ddk $$3 = ddk.a($$1.f());
      ebz.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dzx<?> e() {
      return dzx.k;
   }

   public static enum a implements avl {
      a("warm"),
      b("cold");

      public static final Codec<eca.a> c = avl.a(eca.a::values);
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
