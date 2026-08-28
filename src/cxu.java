import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxu(boolean c) implements cxt {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxu::a)).apply($$0, cxu::new)
   );
   public static final zm<ByteBuf, cxu> b = zk.b.a(cxu::new, cxu::a);
   private static final xo d = xo.c("item.unbreakable").a(n.j);

   @Override
   public void a(cui.b $$0, Consumer<xo> $$1, cwg $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxu a(boolean $$0) {
      return new cxu($$0);
   }

   public boolean a() {
      return this.c;
   }
}
