import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxi(boolean c) implements cxh {
   public static final Codec<cxi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxi::a)).apply($$0, cxi::new)
   );
   public static final ys<ByteBuf, cxi> b = yq.b.a(cxi::new, cxi::a);
   private static final wu d = wu.c("item.unbreakable").a(n.j);

   @Override
   public void a(ctx.b $$0, Consumer<wu> $$1, cvv $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxi a(boolean $$0) {
      return new cxi($$0);
   }

   public boolean a() {
      return this.c;
   }
}
