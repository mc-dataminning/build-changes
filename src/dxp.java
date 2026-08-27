import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxp(ih<cnb> c, dxr d) {
   public static final Codec<dxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahe.a(ke.F).fieldOf("display").forGetter($$0x -> $$0x.c), dxr.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dxp::new)
   );
   public static final Codec<ih<dxp>> b = ahd.a(ke.az, a);

   public ih<cnb> a() {
      return this.c;
   }

   public dxr b() {
      return this.d;
   }
}
