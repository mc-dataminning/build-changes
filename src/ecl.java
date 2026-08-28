import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ecl implements ect {
   public static final MapCodec<ecl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ji.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ecl::new));
   public static final yn<ByteBuf, ecl> b = yn.a(ji.b, $$0 -> $$0.e, ecl::new);
   private final ji e;

   public ecl(ji $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fbx> a(dgz $$0) {
      return Optional.of(fbx.b(this.e));
   }

   @Override
   public ecu<ecl> a() {
      return ecu.a;
   }

   public static class a implements ecu<ecl> {
      @Override
      public MapCodec<ecl> a() {
         return ecl.a;
      }

      @Override
      public yn<ByteBuf, ecl> b() {
         return ecl.b;
      }
   }
}
