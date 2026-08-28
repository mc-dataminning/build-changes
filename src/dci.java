import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(axt<bvk> c) {
   public static final Codec<dci> a = RecordCodecBuilder.create($$0 -> $$0.group(axt.b(mh.aN).fieldOf("types").forGetter(dci::a)).apply($$0, dci::new));
   public static final yy<wl, dci> b = yy.a(axt.c(mh.aN), dci::a, dci::new);

   public boolean a(bvi $$0) {
      return $$0.a(this.c);
   }

   public axt<bvk> a() {
      return this.c;
   }
}
