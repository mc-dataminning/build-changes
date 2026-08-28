import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fao(boolean b) implements fau {
   public static final MapCodec<fao> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fao::e)).apply($$0, fao::new));

   public boolean a(exl $$0) {
      return $$0.b(faf.l) == this.b;
   }

   @Override
   public fav b() {
      return faw.s;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.l);
   }

   public static fau.a c() {
      return () -> new fao(true);
   }

   public static fau.a d() {
      return () -> new fao(false);
   }

   public boolean e() {
      return this.b;
   }
}
