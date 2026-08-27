import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxe extends duz {
   public static final Codec<dxe> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dxe.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dxe::new)
   );
   public final dxe.a e;
   public final float f;
   public final float g;

   public dxe(duz.c $$0, dxe.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      return a($$0, dkj.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dvr $$0, duz.a $$1) {
      gu $$2 = new gu($$1.h().d(), 90, $$1.h().e());
      cyy $$3 = cyy.a($$1.f());
      dxd.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dvi<?> e() {
      return dvi.k;
   }

   public static enum a implements ash {
      a("warm"),
      b("cold");

      public static final Codec<dxe.a> c = ash.a(dxe.a::values);
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
