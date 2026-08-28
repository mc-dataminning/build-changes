import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyv(boolean b) implements ezb {
   public static final MapCodec<eyv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(eyv::e)).apply($$0, eyv::new));

   public boolean a(evs $$0) {
      return $$0.b(eym.l) == this.b;
   }

   @Override
   public ezc b() {
      return ezd.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.l);
   }

   public static ezb.a c() {
      return () -> new eyv(true);
   }

   public static ezb.a d() {
      return () -> new eyv(false);
   }

   public boolean e() {
      return this.b;
   }
}
