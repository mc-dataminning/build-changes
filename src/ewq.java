import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewq(boolean b) implements eww {
   public static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ewq::e)).apply($$0, ewq::new));

   public boolean a(etl $$0) {
      return $$0.b(ewh.l) == this.b;
   }

   @Override
   public ewx b() {
      return ewy.s;
   }

   @Override
   public Set<ewe<?>> a() {
      return Set.of(ewh.l);
   }

   public static eww.a c() {
      return () -> new ewq(true);
   }

   public static eww.a d() {
      return () -> new ewq(false);
   }

   public boolean e() {
      return this.b;
   }
}
