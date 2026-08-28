import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ebn implements ebv {
   public static final MapCodec<ebn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ji.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ebn::new));
   public static final ym<ByteBuf, ebn> b = ym.a(ji.b, $$0 -> $$0.e, ebn::new);
   private final ji e;

   public ebn(ji $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fay> a(dgg $$0) {
      return Optional.of(fay.b(this.e));
   }

   @Override
   public ebw<ebn> a() {
      return ebw.a;
   }

   public static class a implements ebw<ebn> {
      @Override
      public MapCodec<ebn> a() {
         return ebn.a;
      }

      @Override
      public ym<ByteBuf, ebn> b() {
         return ebn.b;
      }
   }
}
