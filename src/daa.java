import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daa(ayk<buc> c) {
   public static final Codec<daa> a = RecordCodecBuilder.create($$0 -> $$0.group(ayk.b(mb.s).fieldOf("types").forGetter(daa::a)).apply($$0, daa::new));
   public static final zt<xg, daa> b = zt.a(ayk.c(mb.s), daa::a, daa::new);

   public boolean a(bua $$0) {
      return $$0.a(this.c);
   }

   public ayk<buc> a() {
      return this.c;
   }
}
