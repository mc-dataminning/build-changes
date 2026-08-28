import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezb(String b) implements ezd {
   public static final MapCodec<ezb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ezb::c)).apply($$0, ezb::new));

   public static ezd a(String $$0) {
      return new ezb($$0);
   }

   @Override
   public ezc a() {
      return eze.b;
   }

   @Override
   public fbc a(eun $$0) {
      return fbc.c(this.b);
   }

   @Override
   public Set<exg<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
