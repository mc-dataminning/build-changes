import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ean implements eav {
   public static final MapCodec<ean> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ean::new));
   public static final zh<ByteBuf, ean> b = zh.a(jh.b, $$0 -> $$0.e, ean::new);
   private final jh e;

   public ean(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ezy> a(dfm $$0) {
      return Optional.of(ezy.b(this.e));
   }

   @Override
   public eaw<ean> a() {
      return eaw.a;
   }

   public static class a implements eaw<ean> {
      @Override
      public MapCodec<ean> a() {
         return ean.a;
      }

      @Override
      public zh<ByteBuf, ean> b() {
         return ean.b;
      }
   }
}
