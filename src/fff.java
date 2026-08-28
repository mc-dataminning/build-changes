import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fff(String b) implements ffh {
   public static final MapCodec<fff> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fff::c)).apply($$0, fff::new));

   public static ffh a(String $$0) {
      return new fff($$0);
   }

   @Override
   public ffg a() {
      return ffi.b;
   }

   @Override
   public fhg a(fat $$0) {
      return fhg.c(this.b);
   }

   @Override
   public Set<bbk<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
