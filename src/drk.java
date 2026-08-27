import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record drk(float c) implements cxx {
   public static final Codec<drk> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("damage_boost").forGetter(drk::a)).apply($$0, drk::new));
   public static final zc<ByteBuf, drk> b = za.b(a);

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      $$0.accept(xe.a("potato_bane.tooltip.damage_boost", this.c).a(n.k));
   }

   public static float a(cuh $$0, brv $$1) {
      if ($$1.dV()) {
         drk $$2 = $$0.a(ke.ap);
         if ($$2 != null) {
            return $$2.c;
         }
      }

      return 0.0F;
   }

   public float a() {
      return this.c;
   }
}
