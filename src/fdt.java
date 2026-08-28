import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdt(String b) implements fdv {
   public static final MapCodec<fdt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fdt::c)).apply($$0, fdt::new));

   public static fdv a(String $$0) {
      return new fdt($$0);
   }

   @Override
   public fdu a() {
      return fdw.b;
   }

   @Override
   public ffu a(ezh $$0) {
      return ffu.c(this.b);
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
