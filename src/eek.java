import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class eek implements ees {
   public static final MapCodec<eek> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iu.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, eek::new));
   public static final yu<ByteBuf, eek> b = yu.a(iu.b, $$0 -> $$0.e, eek::new);
   private final iu e;

   public eek(iu $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fdw> a(dip $$0) {
      return Optional.of(fdw.b(this.e));
   }

   @Override
   public eet<eek> a() {
      return eet.a;
   }

   public static class a implements eet<eek> {
      @Override
      public MapCodec<eek> a() {
         return eek.a;
      }

      @Override
      public yu<ByteBuf, eek> b() {
         return eek.b;
      }
   }
}
