import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyx(axs<btd> c) {
   public static final Codec<cyx> a = RecordCodecBuilder.create($$0 -> $$0.group(axs.b(ma.s).fieldOf("types").forGetter(cyx::a)).apply($$0, cyx::new));
   public static final zh<wu, cyx> b = zh.a(axs.c(ma.s), cyx::a, cyx::new);

   public boolean a(btb $$0) {
      return $$0.a(this.c);
   }

   public axs<btd> a() {
      return this.c;
   }
}
