import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cdx(akf b, akf c, akf d, iz<dat> e) {
   public static final Codec<cdx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akf.a.fieldOf("texture").forGetter(cdx::a),
               akf.a.fieldOf("tame_texture").forGetter(cdx::b),
               akf.a.fieldOf("angry_texture").forGetter(cdx::c),
               jk.a(ld.ay).fieldOf("biomes").forGetter(cdx::d)
            )
            .apply($$0, cdx::new)
   );

   public akf a() {
      return this.b;
   }

   public akf b() {
      return this.c;
   }

   public akf c() {
      return this.d;
   }

   public iz<dat> d() {
      return this.e;
   }
}
