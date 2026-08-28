import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fba(String b) implements fbc {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fba::c)).apply($$0, fba::new));

   public static fbc a(String $$0) {
      return new fba($$0);
   }

   @Override
   public fbb a() {
      return fbd.b;
   }

   @Override
   public fdb a(ewo $$0) {
      return fdb.c(this.b);
   }

   @Override
   public Set<bbn<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
