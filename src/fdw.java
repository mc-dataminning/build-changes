import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdw(boolean b) implements fec {
   public static final MapCodec<fdw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fdw::e)).apply($$0, fdw::new));

   public boolean a(fat $$0) {
      return $$0.b(fdn.l) == this.b;
   }

   @Override
   public fed b() {
      return fee.s;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.l);
   }

   public static fec.a c() {
      return () -> new fdw(true);
   }

   public static fec.a d() {
      return () -> new fdw(false);
   }

   public boolean e() {
      return this.b;
   }
}
