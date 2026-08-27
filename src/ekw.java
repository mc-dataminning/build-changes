import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekw(String b) implements eky {
   public static final Codec<ekw> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ekw::c)).apply($$0, ekw::new));

   public static eky a(String $$0) {
      return new ekw($$0);
   }

   @Override
   public ekx a() {
      return ekz.b;
   }

   @Override
   public emw a(egw $$0) {
      return emw.d(this.b);
   }

   @Override
   public Set<eje<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
