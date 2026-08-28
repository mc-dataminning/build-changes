import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czr(aya<btt> c) {
   public static final Codec<czr> a = RecordCodecBuilder.create($$0 -> $$0.group(aya.b(mb.s).fieldOf("types").forGetter(czr::a)).apply($$0, czr::new));
   public static final zi<wv, czr> b = zi.a(aya.c(mb.s), czr::a, czr::new);

   public boolean a(btr $$0) {
      return $$0.a(this.c);
   }

   public aya<btt> a() {
      return this.c;
   }
}
