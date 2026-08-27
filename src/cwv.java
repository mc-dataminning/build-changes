import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cwv(boolean c) implements cwu {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwv::a)).apply($$0, cwv::new)
   );
   public static final yv<ByteBuf, cwv> b = yt.b.a(cwv::new, cwv::a);
   private static final wx d = wx.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<wx> $$0, cvh $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public cwv a(boolean $$0) {
      return new cwv($$0);
   }

   public boolean a() {
      return this.c;
   }
}
