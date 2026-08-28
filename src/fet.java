import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fet(String b) implements fev {
   public static final MapCodec<fet> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fet::c)).apply($$0, fet::new));

   public static fev a(String $$0) {
      return new fet($$0);
   }

   @Override
   public feu a() {
      return few.b;
   }

   @Override
   public fgu a(fah $$0) {
      return fgu.c(this.b);
   }

   @Override
   public Set<baz<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
