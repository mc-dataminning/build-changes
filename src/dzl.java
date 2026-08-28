import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dzl implements dzt {
   public static final MapCodec<dzl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jf.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dzl::new));
   public static final zc<ByteBuf, dzl> b = zc.a(jf.b, $$0 -> $$0.e, dzl::new);
   private final jf e;

   public dzl(jf $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<eyw> a(dej $$0) {
      return Optional.of(eyw.b(this.e));
   }

   @Override
   public dzu<dzl> a() {
      return dzu.a;
   }

   public static class a implements dzu<dzl> {
      @Override
      public MapCodec<dzl> a() {
         return dzl.a;
      }

      @Override
      public zc<ByteBuf, dzl> b() {
         return dzl.b;
      }
   }
}
