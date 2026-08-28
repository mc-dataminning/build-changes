import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dws implements dxa {
   public static final MapCodec<dws> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dws::new));
   public static final zn<ByteBuf, dws> b = zn.a(iz.b, $$0 -> $$0.e, dws::new);
   private final iz e;

   public dws(iz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evs> a(dbz $$0) {
      return Optional.of(evs.b(this.e));
   }

   @Override
   public dxb<dws> a() {
      return dxb.a;
   }

   public static class a implements dxb<dws> {
      @Override
      public MapCodec<dws> a() {
         return dws.a;
      }

      @Override
      public zn<ByteBuf, dws> b() {
         return dws.b;
      }
   }
}
