import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cwe(boolean c) implements cwd {
   public static final Codec<cwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cwe::a)).apply($$0, cwe::new)
   );
   public static final ys<ByteBuf, cwe> b = yq.b.a(cwe::new, cwe::a);
   private static final wu d = wu.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public cwe a(boolean $$0) {
      return new cwe($$0);
   }

   public boolean a() {
      return this.c;
   }
}
