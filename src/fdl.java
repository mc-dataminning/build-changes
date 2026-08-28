import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdl(String b) implements fdn {
   public static final MapCodec<fdl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fdl::c)).apply($$0, fdl::new));

   public static fdn a(String $$0) {
      return new fdl($$0);
   }

   @Override
   public fdm a() {
      return fdo.b;
   }

   @Override
   public ffm a(eyz $$0) {
      return ffm.c(this.b);
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
