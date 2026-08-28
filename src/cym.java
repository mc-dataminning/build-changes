import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cym(axq<bsw> c) {
   public static final Codec<cym> a = RecordCodecBuilder.create($$0 -> $$0.group(axq.b(lz.s).fieldOf("types").forGetter(cym::a)).apply($$0, cym::new));
   public static final zg<wt, cym> b = zg.a(axq.c(lz.s), cym::a, cym::new);

   public boolean a(bsu $$0) {
      return $$0.a(this.c);
   }

   public axq<bsw> a() {
      return this.c;
   }
}
