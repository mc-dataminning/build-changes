import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dag(axp<buj> c) {
   public static final Codec<dag> a = RecordCodecBuilder.create($$0 -> $$0.group(axp.b(me.s).fieldOf("types").forGetter(dag::a)).apply($$0, dag::new));
   public static final yt<wg, dag> b = yt.a(axp.c(me.s), dag::a, dag::new);

   public boolean a(buh $$0) {
      return $$0.a(this.c);
   }

   public axp<buj> a() {
      return this.c;
   }
}
