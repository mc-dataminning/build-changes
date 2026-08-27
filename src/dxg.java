import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxg(ih<cms> c, dxi d) {
   public static final Codec<dxg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahd.a(ke.F).fieldOf("display").forGetter($$0x -> $$0x.c), dxi.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dxg::new)
   );
   public static final Codec<ih<dxg>> b = ahc.a(ke.az, a);

   public ih<cms> a() {
      return this.c;
   }

   public dxi b() {
      return this.d;
   }
}
