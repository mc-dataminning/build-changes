import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cyx(boolean c) implements cyw {
   public static final Codec<cyx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyx::a)).apply($$0, cyx::new)
   );
   public static final zb<ByteBuf, cyx> b = yz.b.a(cyx::new, cyx::a);
   private static final xd d = xd.c("item.unbreakable").a(n.j);

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cyx a(boolean $$0) {
      return new cyx($$0);
   }

   public boolean a() {
      return this.c;
   }
}
