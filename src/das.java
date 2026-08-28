import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record das(boolean c) implements dar {
   public static final Codec<das> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(das::a)).apply($$0, das::new)
   );
   public static final zt<ByteBuf, das> b = zr.b.a(das::new, das::a);
   private static final xv d = xv.c("item.unbreakable").a(n.j);

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public das a(boolean $$0) {
      return new das($$0);
   }

   public boolean a() {
      return this.c;
   }
}
