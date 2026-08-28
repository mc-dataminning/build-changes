import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cyz(boolean c) implements cyy {
   public static final Codec<cyz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyz::a)).apply($$0, cyz::new)
   );
   public static final zf<ByteBuf, cyz> b = zd.b.a(cyz::new, cyz::a);
   private static final xh d = xh.c("item.unbreakable").a(n.j);

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cyz a(boolean $$0) {
      return new cyz($$0);
   }

   public boolean a() {
      return this.c;
   }
}
