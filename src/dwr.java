import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dwr implements dwz {
   public static final MapCodec<dwr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dwr::new));
   public static final zn<ByteBuf, dwr> b = zn.a(iz.b, $$0 -> $$0.e, dwr::new);
   private final iz e;

   public dwr(iz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evr> a(dby $$0) {
      return Optional.of(evr.b(this.e));
   }

   @Override
   public dxa<dwr> a() {
      return dxa.a;
   }

   public static class a implements dxa<dwr> {
      @Override
      public MapCodec<dwr> a() {
         return dwr.a;
      }

      @Override
      public zn<ByteBuf, dwr> b() {
         return dwr.b;
      }
   }
}
