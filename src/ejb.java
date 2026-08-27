import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejb extends egp {
   public static final Codec<ejb> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               ejb.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejb::new)
   );
   public final ejb.a e;
   public final float f;
   public final float g;

   public ejb(egp.c $$0, ejb.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      return a($$0, dvz.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ehh $$0, egp.a $$1) {
      in $$2 = new in($$1.h().d(), 90, $$1.h().e());
      djr $$3 = djr.a($$1.f());
      eja.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public egy<?> e() {
      return egy.k;
   }

   public static enum a implements ayt {
      a("warm"),
      b("cold");

      public static final Codec<ejb.a> c = ayt.a(ejb.a::values);
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
