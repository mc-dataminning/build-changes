import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvq implements dvy {
   public static final MapCodec<dvq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(io.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dvq::new));
   public static final yv<wi, dvq> b = yv.a(io.b, $$0 -> $$0.e, dvq::new);
   private final io e;

   public dvq(io $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<euk> a(dax $$0) {
      return Optional.of(euk.b(this.e));
   }

   @Override
   public dvz<dvq> a() {
      return dvz.a;
   }

   public static class a implements dvz<dvq> {
      @Override
      public MapCodec<dvq> a() {
         return dvq.a;
      }

      @Override
      public yv<wi, dvq> b() {
         return dvq.b;
      }
   }
}
