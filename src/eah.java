import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eah(il<cpl> c, eaj d) {
   public static final Codec<eah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiz.a(ki.F).fieldOf("display").forGetter($$0x -> $$0x.c), eaj.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eah::new)
   );
   public static final Codec<il<eah>> b = aiy.a(ki.aA, a);

   public il<cpl> a() {
      return this.c;
   }

   public eaj b() {
      return this.d;
   }
}
