import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyy(axe<btb> c) {
   public static final Codec<cyy> a = RecordCodecBuilder.create($$0 -> $$0.group(axe.b(mc.s).fieldOf("types").forGetter(cyy::a)).apply($$0, cyy::new));
   public static final ym<vz, cyy> b = ym.a(axe.c(mc.s), cyy::a, cyy::new);

   public boolean a(bsz $$0) {
      return $$0.a(this.c);
   }

   public axe<btb> a() {
      return this.c;
   }
}
