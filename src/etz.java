import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etz(boolean b) implements euf {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(etz::e)).apply($$0, etz::new));

   public boolean a(equ $$0) {
      return $$0.b(etq.l) == this.b;
   }

   @Override
   public eug b() {
      return euh.s;
   }

   @Override
   public Set<etn<?>> a() {
      return Set.of(etq.l);
   }

   public static euf.a c() {
      return () -> new etz(true);
   }

   public static euf.a d() {
      return () -> new etz(false);
   }

   public boolean e() {
      return this.b;
   }
}
