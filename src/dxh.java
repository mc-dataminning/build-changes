import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxh(ih<cmt> c, dxj d) {
   public static final Codec<dxh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahd.a(ke.F).fieldOf("display").forGetter($$0x -> $$0x.c), dxj.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dxh::new)
   );
   public static final Codec<ih<dxh>> b = ahc.a(ke.az, a);

   public ih<cmt> a() {
      return this.c;
   }

   public dxj b() {
      return this.d;
   }
}
