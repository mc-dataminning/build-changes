import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class eac implements eak {
   public static final MapCodec<eac> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, eac::new));
   public static final zg<ByteBuf, eac> b = zg.a(jh.b, $$0 -> $$0.e, eac::new);
   private final jh e;

   public eac(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ezn> a(dfb $$0) {
      return Optional.of(ezn.b(this.e));
   }

   @Override
   public eal<eac> a() {
      return eal.a;
   }

   public static class a implements eal<eac> {
      @Override
      public MapCodec<eac> a() {
         return eac.a;
      }

      @Override
      public zg<ByteBuf, eac> b() {
         return eac.b;
      }
   }
}
