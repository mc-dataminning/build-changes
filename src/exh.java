import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exh(boolean b) implements exn {
   public static final MapCodec<exh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(exh::e)).apply($$0, exh::new));

   public boolean a(euc $$0) {
      return $$0.b(ewy.l) == this.b;
   }

   @Override
   public exo b() {
      return exp.s;
   }

   @Override
   public Set<ewv<?>> a() {
      return Set.of(ewy.l);
   }

   public static exn.a c() {
      return () -> new exh(true);
   }

   public static exn.a d() {
      return () -> new exh(false);
   }

   public boolean e() {
      return this.b;
   }
}
