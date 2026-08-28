import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fea(String b) implements fec {
   public static final MapCodec<fea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fea::c)).apply($$0, fea::new));

   public static fec a(String $$0) {
      return new fea($$0);
   }

   @Override
   public feb a() {
      return fed.b;
   }

   @Override
   public fgb a(ezo $$0) {
      return fgb.c(this.b);
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
