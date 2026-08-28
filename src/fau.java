import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fau(String b) implements faw {
   public static final MapCodec<fau> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fau::c)).apply($$0, fau::new));

   public static faw a(String $$0) {
      return new fau($$0);
   }

   @Override
   public fav a() {
      return fax.b;
   }

   @Override
   public fcv a(ewi $$0) {
      return fcv.c(this.b);
   }

   @Override
   public Set<bbd<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
