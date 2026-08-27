import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cyb(int d) implements cxx {
   public static final cyb a = new cyb(10);
   public static final Codec<cyb> b = Codec.INT.xmap(cyb::new, cyb::a);
   public static final zc<ByteBuf, cyb> c = za.f.a(cyb::new, cyb::a);

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      $$0.accept(xe.a("item.minecraft.potato_of_knowledge.amount", this.d));
   }

   public int a() {
      return this.d;
   }
}
