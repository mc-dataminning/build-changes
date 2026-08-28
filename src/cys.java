import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cys(boolean c) implements cyr {
   public static final Codec<cys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cys::a)).apply($$0, cys::new)
   );
   public static final zb<ByteBuf, cys> b = yz.b.a(cys::new, cys::a);
   private static final xd d = xd.c("item.unbreakable").a(n.j);

   @Override
   public void a(cvg.b $$0, Consumer<xd> $$1, cxf $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cys a(boolean $$0) {
      return new cys($$0);
   }

   public boolean a() {
      return this.c;
   }
}
