import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbn(axr<buw> c) {
   public static final Codec<dbn> a = RecordCodecBuilder.create($$0 -> $$0.group(axr.b(mg.aN).fieldOf("types").forGetter(dbn::a)).apply($$0, dbn::new));
   public static final yw<wj, dbn> b = yw.a(axr.c(mg.aN), dbn::a, dbn::new);

   public boolean a(buu $$0) {
      return $$0.a(this.c);
   }

   public axr<buw> a() {
      return this.c;
   }
}
