import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dzh implements dzp {
   public static final MapCodec<dzh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(je.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dzh::new));
   public static final zb<ByteBuf, dzh> b = zb.a(je.b, $$0 -> $$0.e, dzh::new);
   private final je e;

   public dzh(je $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<eys> a(deg $$0) {
      return Optional.of(eys.b(this.e));
   }

   @Override
   public dzq<dzh> a() {
      return dzq.a;
   }

   public static class a implements dzq<dzh> {
      @Override
      public MapCodec<dzh> a() {
         return dzh.a;
      }

      @Override
      public zb<ByteBuf, dzh> b() {
         return dzh.b;
      }
   }
}
