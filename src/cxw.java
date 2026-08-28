import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxw(boolean c) implements cxv {
   public static final Codec<cxw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxw::a)).apply($$0, cxw::new)
   );
   public static final zn<ByteBuf, cxw> b = zl.b.a(cxw::new, cxw::a);
   private static final xp d = xp.c("item.unbreakable").a(n.j);

   @Override
   public void a(cuk.b $$0, Consumer<xp> $$1, cwi $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxw a(boolean $$0) {
      return new cxw($$0);
   }

   public boolean a() {
      return this.c;
   }
}
