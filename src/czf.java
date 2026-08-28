import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czf(boolean c) implements cze {
   public static final Codec<czf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czf::a)).apply($$0, czf::new)
   );
   public static final zg<ByteBuf, czf> b = ze.b.a(czf::new, czf::a);
   private static final xi d = xi.c("item.unbreakable").a(n.j);

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czf a(boolean $$0) {
      return new czf($$0);
   }

   public boolean a() {
      return this.c;
   }
}
