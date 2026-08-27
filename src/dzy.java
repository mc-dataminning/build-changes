import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzy extends dxm {
   public static final Codec<dzy> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dzy.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzy::new)
   );
   public final dzy.a e;
   public final float f;
   public final float g;

   public dzy(dxm.c $$0, dzy.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      return a($$0, dmw.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dye $$0, dxm.a $$1) {
      hx $$2 = new hx($$1.h().d(), 90, $$1.h().e());
      dbr $$3 = dbr.a($$1.f());
      dzx.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dxv<?> e() {
      return dxv.k;
   }

   public static enum a implements auk {
      a("warm"),
      b("cold");

      public static final Codec<dzy.a> c = auk.a(dzy.a::values);
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
