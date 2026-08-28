import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czv(ayk<btx> c) {
   public static final Codec<czv> a = RecordCodecBuilder.create($$0 -> $$0.group(ayk.b(mb.s).fieldOf("types").forGetter(czv::a)).apply($$0, czv::new));
   public static final zt<xg, czv> b = zt.a(ayk.c(mb.s), czv::a, czv::new);

   public boolean a(btv $$0) {
      return $$0.a(this.c);
   }

   public ayk<btx> a() {
      return this.c;
   }
}
