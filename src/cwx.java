import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cwx(boolean c) implements cww {
   public static final Codec<cwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwx::a)).apply($$0, cwx::new)
   );
   public static final yv<ByteBuf, cwx> b = yt.b.a(cwx::new, cwx::a);
   private static final wx d = wx.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public cwx a(boolean $$0) {
      return new cwx($$0);
   }

   public boolean a() {
      return this.c;
   }
}
