import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fck(boolean b) implements fcq {
   public static final MapCodec<fck> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fck::e)).apply($$0, fck::new));

   public boolean a(ezh $$0) {
      return $$0.b(fcb.l) == this.b;
   }

   @Override
   public fcr b() {
      return fcs.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.l);
   }

   public static fcq.a c() {
      return () -> new fck(true);
   }

   public static fcq.a d() {
      return () -> new fck(false);
   }

   public boolean e() {
      return this.b;
   }
}
