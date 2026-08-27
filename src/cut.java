import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cut(boolean c) implements cus {
   public static final Codec<cut> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cut::a)).apply($$0, cut::new)
   );
   public static final yg<ByteBuf, cut> b = ye.b.a(cut::new, cut::a);
   private static final wi d = wi.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public boolean a() {
      return this.c;
   }
}
