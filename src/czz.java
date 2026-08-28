import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czz(ayk<bub> c) {
   public static final Codec<czz> a = RecordCodecBuilder.create($$0 -> $$0.group(ayk.b(mb.s).fieldOf("types").forGetter(czz::a)).apply($$0, czz::new));
   public static final zt<xg, czz> b = zt.a(ayk.c(mb.s), czz::a, czz::new);

   public boolean a(btz $$0) {
      return $$0.a(this.c);
   }

   public ayk<bub> a() {
      return this.c;
   }
}
