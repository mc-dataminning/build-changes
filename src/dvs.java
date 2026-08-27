import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvs implements dwa {
   public static final MapCodec<dvs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(io.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dvs::new));
   public static final yv<wi, dvs> b = yv.a(io.b, $$0 -> $$0.e, dvs::new);
   private final io e;

   public dvs(io $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<eum> a(daz $$0) {
      return Optional.of(eum.b(this.e));
   }

   @Override
   public dwb<dvs> a() {
      return dwb.a;
   }

   public static class a implements dwb<dvs> {
      @Override
      public MapCodec<dvs> a() {
         return dvs.a;
      }

      @Override
      public yv<wi, dvs> b() {
         return dvs.b;
      }
   }
}
