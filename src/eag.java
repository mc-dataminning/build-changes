import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class eag implements eao {
   public static final MapCodec<eag> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, eag::new));
   public static final zj<ByteBuf, eag> b = zj.a(jh.b, $$0 -> $$0.e, eag::new);
   private final jh e;

   public eag(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ezr> a(dff $$0) {
      return Optional.of(ezr.b(this.e));
   }

   @Override
   public eap<eag> a() {
      return eap.a;
   }

   public static class a implements eap<eag> {
      @Override
      public MapCodec<eag> a() {
         return eag.a;
      }

      @Override
      public zj<ByteBuf, eag> b() {
         return eag.b;
      }
   }
}
