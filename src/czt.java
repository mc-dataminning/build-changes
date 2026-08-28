import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czt(boolean c) implements czs {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czt::a)).apply($$0, czt::new)
   );
   public static final ym<ByteBuf, czt> b = yk.b.a(czt::new, czt::a);
   private static final wo d = wo.c("item.unbreakable").a(n.j);

   @Override
   public void a(cwl.b $$0, Consumer<wo> $$1, cyh $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czt a(boolean $$0) {
      return new czt($$0);
   }

   public boolean a() {
      return this.c;
   }
}
