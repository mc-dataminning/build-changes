import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzf(ij<cou> c, dzh d) {
   public static final Codec<dzf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiv.a(kg.F).fieldOf("display").forGetter($$0x -> $$0x.c), dzh.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dzf::new)
   );
   public static final Codec<ij<dzf>> b = aiu.a(kg.az, a);

   public ij<cou> a() {
      return this.c;
   }

   public dzh b() {
      return this.d;
   }
}
