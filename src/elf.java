import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record elf(String b) implements elh {
   public static final Codec<elf> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(elf::c)).apply($$0, elf::new));

   public static elh a(String $$0) {
      return new elf($$0);
   }

   @Override
   public elg a() {
      return eli.b;
   }

   @Override
   public enf a(ehf $$0) {
      return enf.d(this.b);
   }

   @Override
   public Set<ejn<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
