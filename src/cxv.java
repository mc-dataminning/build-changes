import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxv(boolean c) implements cxu {
   public static final Codec<cxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxv::a)).apply($$0, cxv::new)
   );
   public static final zm<ByteBuf, cxv> b = zk.b.a(cxv::new, cxv::a);
   private static final xo d = xo.c("item.unbreakable").a(n.j);

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxv a(boolean $$0) {
      return new cxv($$0);
   }

   public boolean a() {
      return this.c;
   }
}
