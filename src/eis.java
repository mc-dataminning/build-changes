import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eis extends egg {
   public static final Codec<eis> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               eis.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eis::new)
   );
   public final eis.a e;
   public final float f;
   public final float g;

   public eis(egg.c $$0, eis.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      return a($$0, dvq.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(egy $$0, egg.a $$1) {
      im $$2 = new im($$1.h().d(), 90, $$1.h().e());
      dji $$3 = dji.a($$1.f());
      eir.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public egp<?> e() {
      return egp.k;
   }

   public static enum a implements ayq {
      a("warm"),
      b("cold");

      public static final Codec<eis.a> c = ayq.a(eis.a::values);
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
