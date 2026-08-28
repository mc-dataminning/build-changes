import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxz(boolean c) implements cxy {
   public static final Codec<cxz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxz::a)).apply($$0, cxz::new)
   );
   public static final yx<ByteBuf, cxz> b = yv.b.a(cxz::new, cxz::a);
   private static final wz d = wz.c("item.unbreakable").a(n.j);

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxz a(boolean $$0) {
      return new cxz($$0);
   }

   public boolean a() {
      return this.c;
   }
}
