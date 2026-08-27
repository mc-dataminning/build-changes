import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cuk(boolean c) implements cuj {
   public static final Codec<cuk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cuk::a)).apply($$0, cuk::new)
   );
   public static final ye<ByteBuf, cuk> b = yc.b.a(cuk::new, cuk::a);
   private static final wg d = wg.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<wg> $$0, csz $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public boolean a() {
      return this.c;
   }
}
