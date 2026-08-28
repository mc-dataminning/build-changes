import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czu(boolean c) implements czt {
   public static final Codec<czu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czu::a)).apply($$0, czu::new)
   );
   public static final yn<ByteBuf, czu> b = yl.b.a(czu::new, czu::a);
   private static final wp d = wp.c("item.unbreakable").a(n.j);

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czu a(boolean $$0) {
      return new czu($$0);
   }

   public boolean a() {
      return this.c;
   }
}
