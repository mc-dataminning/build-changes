import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eil(String b) implements ein {
   public static final Codec<eil> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eil::c)).apply($$0, eil::new));

   public static ein a(String $$0) {
      return new eil($$0);
   }

   @Override
   public eim a() {
      return eio.b;
   }

   @Nullable
   @Override
   public String a(eel $$0) {
      return this.b;
   }

   @Override
   public Set<egt<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
