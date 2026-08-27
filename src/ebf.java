import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebf(il<cqh> c, ebh d) {
   public static final Codec<ebf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aje.a(kj.F).fieldOf("display").forGetter($$0x -> $$0x.c), ebh.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ebf::new)
   );
   public static final Codec<il<ebf>> b = ajd.a(kj.aA, a);

   public il<cqh> a() {
      return this.c;
   }

   public ebh b() {
      return this.d;
   }
}
