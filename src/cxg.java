import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxg(boolean c) implements cxf {
   public static final Codec<cxg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxg::a)).apply($$0, cxg::new)
   );
   public static final ys<ByteBuf, cxg> b = yq.b.a(cxg::new, cxg::a);
   private static final wu d = wu.c("item.unbreakable").a(n.j);

   @Override
   public void a(ctv.b $$0, Consumer<wu> $$1, cvt $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxg a(boolean $$0) {
      return new cxg($$0);
   }

   public boolean a() {
      return this.c;
   }
}
