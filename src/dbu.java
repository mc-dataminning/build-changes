import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbu(axr<buz> c) {
   public static final Codec<dbu> a = RecordCodecBuilder.create($$0 -> $$0.group(axr.b(mh.aN).fieldOf("types").forGetter(dbu::a)).apply($$0, dbu::new));
   public static final yw<wj, dbu> b = yw.a(axr.c(mh.aN), dbu::a, dbu::new);

   public boolean a(bux $$0) {
      return $$0.a(this.c);
   }

   public axr<buz> a() {
      return this.c;
   }
}
