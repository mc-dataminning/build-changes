import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxy(boolean c) implements cxx {
   public static final Codec<cxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cxy::a)).apply($$0, cxy::new)
   );
   public static final zc<ByteBuf, cxy> b = za.b.a(cxy::new, cxy::a);
   private static final xe d = xe.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public cxy a(boolean $$0) {
      return new cxy($$0);
   }

   public boolean a() {
      return this.c;
   }
}
