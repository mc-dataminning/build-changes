import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fav(String b) implements fax {
   public static final MapCodec<fav> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fav::c)).apply($$0, fav::new));

   public static fax a(String $$0) {
      return new fav($$0);
   }

   @Override
   public faw a() {
      return fay.b;
   }

   @Override
   public fcw a(ewh $$0) {
      return fcw.c(this.b);
   }

   @Override
   public Set<eza<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
