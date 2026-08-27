import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evx(String b) implements evz {
   public static final Codec<evx> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(evx::c)).apply($$0, evx::new));

   public static evz a(String $$0) {
      return new evx($$0);
   }

   @Override
   public evy a() {
      return ewa.b;
   }

   @Override
   public exx a(erp $$0) {
      return exx.e(this.b);
   }

   @Override
   public Set<eud<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
