import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxj(boolean c) implements cxi {
   public static final Codec<cxj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxj::a)).apply($$0, cxj::new)
   );
   public static final ys<ByteBuf, cxj> b = yq.b.a(cxj::new, cxj::a);
   private static final wu d = wu.c("item.unbreakable").a(n.j);

   @Override
   public void a(cty.b $$0, Consumer<wu> $$1, cvw $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxj a(boolean $$0) {
      return new cxj($$0);
   }

   public boolean a() {
      return this.c;
   }
}
