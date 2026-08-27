import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebd(il<cqf> c, ebf d) {
   public static final Codec<ebd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aje.a(kj.F).fieldOf("display").forGetter($$0x -> $$0x.c), ebf.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ebd::new)
   );
   public static final Codec<il<ebd>> b = ajd.a(kj.aA, a);

   public il<cqf> a() {
      return this.c;
   }

   public ebf b() {
      return this.d;
   }
}
