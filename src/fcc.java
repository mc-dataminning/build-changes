import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcc(boolean b) implements fci {
   public static final MapCodec<fcc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fcc::e)).apply($$0, fcc::new));

   public boolean a(eyz $$0) {
      return $$0.b(fbt.l) == this.b;
   }

   @Override
   public fcj b() {
      return fck.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.l);
   }

   public static fci.a c() {
      return () -> new fcc(true);
   }

   public static fci.a d() {
      return () -> new fcc(false);
   }

   public boolean e() {
      return this.b;
   }
}
